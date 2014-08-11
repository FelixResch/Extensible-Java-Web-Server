package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers={Browsers.SAFARI})
public class DATALIST extends HTMLElement {

	public DATALIST(Object... children) {
		super("datalist", children);
	}

	public DATALIST() {
		super("datalist");
	}

}
