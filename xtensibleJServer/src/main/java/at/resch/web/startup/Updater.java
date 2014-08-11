package at.resch.web.startup;

import at.resch.web.logging.Log;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by felix on 8/11/14.
 */
public class Updater {

    private Properties coreVersions;
    private ClassLoader startupClassLoader;
    private URL[] core_jars;

    public static void main(String[] args) {
        Log.init();
        Log.i("Starting Update Routine for XTensibleJServer");
        Updater u = new Updater();
        try {
            u.readCoreVersions();
        } catch (IOException e) {
            Log.e(e.getMessage(), e);
        }
        u.updateCoreWithGit();
        u.initClassLoader();
        u.invokeServer();
    }

    protected void initClassLoader() {
        startupClassLoader = new URLClassLoader(core_jars);
    }

    protected void invokeServer() {
        try {
            Log.d("Loading default Startup class");
            Class<?> server = startupClassLoader.loadClass("at.resch.web.server.Server");
            Log.d("Class found");
            Log.d("Invoking Method start(String[])");
            try {
                Method m = server.getMethod("start", new Class<?>[]{String[].class});
                Object s = server.newInstance();
                m.invoke(s, new Object[] {new String[0]});
            } catch (NoSuchMethodException e) {
                Log.f("Couldn't find entry point for server", e);
            } catch (InstantiationException e) {
                Log.f("Couldn't instantiate server", e);
            } catch (IllegalAccessException e) {
                Log.f("Couldn't access entry point", e);
            } catch (InvocationTargetException e) {
                Log.f("Fatal error while executing Server", e);
            }
        } catch (ClassNotFoundException e) {
            Log.f("Couldn't find startup class for Server...", e);
        }
    }

    protected void readCoreVersions() throws IOException {
        Log.d("Reading core_versions.properties");
        coreVersions = new Properties();
        try {
            coreVersions.load(new FileInputStream("core_versions.properties"));
        } catch (FileNotFoundException e) {
            Log.w("File not found. Using hardcoded values. (This will most likely cause an update!)");
            coreVersions.setProperty("core_html", "0.0.1-indev");
        }
    }

    protected void updateCoreWithGit() {
        Log.d("Checking local system for required dirctory structure");
        File f = new File("core_lib");
        ArrayList<URL> urls = new ArrayList<URL>();
        if(!f.exists()) {
            Log.d("Initializing core_lib directory");
            f.mkdir();
        } else if (f.exists() && f.isFile()) {
            Log.f("core_lib folder is a file. Please delte the file and restart the Server!");
            System.exit(-1);
        }
        try {
            Log.d("Fetching remote version properties");
            URL url = new URL("https://raw.githubusercontent.com/FelixResch/Extensible-Java-Web-Server/master/xtensibleJServer/core_versions.properties");
            URLConnection con = url.openConnection();
            Properties remote = new Properties();
            remote.load(con.getInputStream());
            Log.i("Remote Versions");
            remote.list(System.out);
            Log.d("Comparing with local versions");
            for (Object key : remote.keySet()) {
                if (!coreVersions.containsKey(key) || !coreVersions.getProperty(key.toString()).equals(remote.getProperty(key.toString()))) {
                        Log.d("Updating " + key.toString());
                        URL lib = new URL("https://github.com/FelixResch/Extensible-Java-Web-Server/raw/master/" + key + "/target/" + key + "-" + remote.getProperty(key.toString()) + ".jar");
                        URLConnection lib_con = lib.openConnection();
                        int content = lib_con.getContentLength();
                        FileOutputStream fos = new FileOutputStream("core_lib/" + key + ".jar");
                        InputStream lib_in = lib_con.getInputStream();
                        byte[] buffer = new byte[4096];
                        int n = 0;
                        int current = 0;
                        while((n = lib_in.read(buffer)) != -1) {
                            fos.write(buffer, 0, n);
                            current += n;
                            drawProgress(current, content, true);
                        }
                        drawProgress(content, content, true);
                        System.out.println();
                        fos.close();
                        lib_in.close();
                        coreVersions.setProperty(key.toString(), remote.getProperty(key.toString()));
                        Log.i("Download complete! (" + lib.toString() + ")");
                }
                try {
                    urls.add(new URL("file://" + System.getProperty("user.dir") + "/core_lib/" + key + ".jar"));
                } catch (MalformedURLException e) {
                    Log.w("Couldn't add core_lib " + key, e);
                }
            }
            Log.d("URLs to load from " + urls.toString());
            core_jars = new URL[urls.size()];
            for (int i = 0; i < core_jars.length; i++) {
                core_jars[i] = urls.get(i);
            }
            coreVersions.store(new FileOutputStream("core_versions.properties"), "Local Core Library Versions");
        } catch (MalformedURLException e) {
            Log.e("Malformed URL", e);
        } catch (IOException e) {
            Log.e("Error while reading remote versions file", e);
        }
    }


    private static void drawProgress(int current, int max, boolean overwrite) {
        if(overwrite) {
            System.out.print("\r");
        } else {
            System.out.println();
        }
        if(current == max) {
            System.out.printf("[%3d%%]", 100);
            int positive = (80 - 5);
            for(int i = 0; i < positive; i++) {
                System.out.print("=");
            }
        } else {
            int percent = (int) ((double) current / (double) max * 100.d);
            System.out.printf("[%3d%%]", percent);
            int positive = (int) ((80 - 5) * ((double) percent / 100.d) - 1);
            int negative = (80 - 5) - positive - 1;
            for (int i = 0; i < positive; i++) {
                System.out.print("=");
            }
            System.out.print(">");
            for (int i = 0; i < negative; i++) {
                System.out.print(".");
            }
        }
    }

}
