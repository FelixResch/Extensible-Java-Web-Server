package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;

@NotSupportedInBrowsers
public class MAIN extends HTMLElement {

	public MAIN(Object... children) {
		super("main", children);
	}

	public MAIN(String tagName) {
		super("main");
	}

}
