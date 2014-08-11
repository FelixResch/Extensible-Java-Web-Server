package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;

@NotSupportedInBrowsers
public class WBR extends HTMLElement {

	public WBR(Object... children) {
		super("wbr", children);
	}

	public WBR() {
		super("wbr");
	}

}
