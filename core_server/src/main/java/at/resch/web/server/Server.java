package at.resch.web.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by felix on 8/11/14.
 */
public class Server {

    public static Logger log = LogManager.getLogger(Server.class);

    public void start(String[] args) {
        log.info("Starting Server!");
    }
}
