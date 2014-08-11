package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers = {Browsers.CHROME, Browsers.FIREFOX, Browsers.INTERNET_EXPLORER, Browsers.OPERA, Browsers.SAFARI})
public class MENU extends HTMLElement {

	private static final String ATTRIB_LABEL = "label";
	private static final String ATTRIB_TYPE = "type";
	
	public MENU(Object... children) {
		super("menu", children);
	}

	public MENU() {
		super("menu");
	}
	
	public void setLabel(String label) {
		set(ATTRIB_LABEL , label);
	}
	
	public String getLabel() {
		return get(ATTRIB_LABEL);
	}
	
	public void setType(String type) {
		set(ATTRIB_TYPE , type);
	}
	
	public String getType() {
		return get(ATTRIB_TYPE);
	}
	


}
