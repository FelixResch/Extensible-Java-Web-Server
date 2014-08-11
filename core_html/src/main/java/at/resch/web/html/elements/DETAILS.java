package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers = { Browsers.FIREFOX,
		Browsers.INTERNET_EXPLORER })
public class DETAILS extends HTMLElement {

	private static final String ATTRIB_OPEN = "open";

	public DETAILS(Object... children) {
		super("details", children);
	}

	public DETAILS(String tagName) {
		super("details");
	}

	public void setOpen(String open) {
		set(ATTRIB_OPEN, open);
	}

	public String getOpen() {
		return get(ATTRIB_OPEN);
	}

}
