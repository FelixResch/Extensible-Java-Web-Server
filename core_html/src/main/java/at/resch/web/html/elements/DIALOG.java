package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers = { Browsers.FIREFOX,
		Browsers.INTERNET_EXPLORER, Browsers.OPERA })
public class DIALOG extends HTMLElement {

	private static final String ATTRIB_OPEN = "open";

	public DIALOG(Object... children) {
		super("dialog", children);
	}

	public DIALOG() {
		super("dialog");
	}

	public void setOpen(String open) {
		set(ATTRIB_OPEN, open);
	}

	public String getOpen() {
		return get(ATTRIB_OPEN);
	}
}
