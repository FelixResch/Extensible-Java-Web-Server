package at.resch.web.html.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import at.resch.web.html.enums.Browsers;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NotSupportedInBrowsers {
	public Browsers[] browsers() default {Browsers.INTERNET_EXPLORER};
}
