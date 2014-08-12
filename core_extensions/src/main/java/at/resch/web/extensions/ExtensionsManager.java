package at.resch.web.extensions;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by felix on 8/12/14.
 */
public class ExtensionsManager {

    public static Logger logger = LogManager.getLogger(ExtensionsManager.class);

    public ExtensionsManager() {

    }

    public void init() {
        Reflections reflections = new Reflections();
        Set<Class<?>> types = reflections.getTypesAnnotatedWith(NotSupportedInBrowsers.class);
        for (Class<?> type : types) {
            NotSupportedInBrowsers nsib = type.getAnnotation(NotSupportedInBrowsers.class);
            Browsers[] browsers = nsib.browsers();
            logger.debug(type.getCanonicalName() + " is not supported in " + Arrays.toString(browsers));
        }
    }
}
