package at.resch.web.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by felix on 8/11/14.
 */
public class Log {

    private static Logger log;

    public static final void init() {
        System.out.println("Loading Logging Module");
        log = LogManager.getLogger(Log.class);
    }

    public static void i(String message) {
        log.info(message);
    }

    public static void i(String message, Throwable e) {
        log.info(message, e);
    }

    public static void d(String message) {
        log.debug(message);
    }

    public static void d(String message, Throwable e) {
        log.debug(message, e);
    }

    public static void e(String message) {
        log.error(message);
    }

    public static void e(String message, Throwable e) {
        log.error(message, e);
    }

    public static void w(String message) {
        log.warn(message);
    }

    public static void w(String message, Throwable e) {
        log.warn(message, e);
    }
}
