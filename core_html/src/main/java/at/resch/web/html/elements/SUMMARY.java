package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers = { Browsers.INTERNET_EXPLORER,
		Browsers.FIREFOX, Browsers.OPERA })
public class SUMMARY extends HTMLElement {

	public SUMMARY(Object... children) {
		super("summary", children);
	}

	public SUMMARY() {
		super("summary");
	}

}
