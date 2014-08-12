package at.resch.web.server.util;

import at.resch.web.server.Server;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by felix on 8/12/14.
 */
public class MimeTypeConverter {

    private Properties mimes;

    public MimeTypeConverter() {
        mimes = new Properties();
        File storage = new File("mimes.local");
        if (storage.exists()) {
            try {
                mimes.load(new FileInputStream(storage));
            } catch (IOException e) {
                Server.log.error("Couldn't load local storage. Please delete the file mimes.local to reload it from the internet!", e);
            }
        } else {
            Server.log.info("Loading MIME Types from net");
            try {
                Document page = Jsoup.connect("http://www.sitepoint.com/web-foundations/mime-types-complete-list/").get();
                Elements tables = page.select("table");
                for (Element table : tables) {
                    Element tbody = table.select("tbody").first();
                    Elements rows = tbody.select("tr");
                    for (Element row : rows) {
                        mimes.setProperty(row.child(0).text(), row.child(1).text());
                    }
                }
            } catch (IOException e) {
                Server.log.error("Couldn't load MIME Types");
            }
            try {
                mimes.store(new FileOutputStream(storage), "Common MIME Types");
            } catch (IOException e) {
                Server.log.warn("Couldn't save mimes.local. Server will load the file again on restart!", e);
            }
        }
        Server.log.debug("Found " + mimes.size() + " MIME Types");
    }

    public String getContentType(String extension) {
        return mimes.getProperty(extension);
    }
}
