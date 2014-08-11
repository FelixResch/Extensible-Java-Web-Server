package at.resch.web.startup;

import at.resch.web.logging.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

/**
 * Created by felix on 8/11/14.
 */
public class Updater {

    private Properties coreVersions;

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
    }

    protected void readCoreVersions() throws IOException {
        Log.d("Reading core_versions.properties");
        coreVersions = new Properties();
        try {
            coreVersions.loadFromXML(new FileInputStream("core_versions.properties"));
        } catch (FileNotFoundException e) {
            Log.w("File not found. Using hardcoded values. (This will most likely cause an update!)");
            coreVersions.setProperty("core_html", "0.0.1-indev");
        }
    }

    protected void updateCoreWithGit() {
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
                if (coreVersions.containsKey(key)) {
                    if (!coreVersions.getProperty(key.toString()).equals(remote.getProperty(key.toString()))) {
                        Log.d("Updating " + key.toString());
                    }
                }
            }
        } catch (MalformedURLException e) {
            Log.e("Malformed URL", e);
        } catch (IOException e) {
            Log.e("Error while reading remote versions file");
        }
    }


}
