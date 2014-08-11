package at.resch.web.startup;

import at.resch.web.logging.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            coreVersions.setProperty("core_html.jar", "0.1-indev");
        }
    }

    protected void updateCoreWithGit() {

    }


}
