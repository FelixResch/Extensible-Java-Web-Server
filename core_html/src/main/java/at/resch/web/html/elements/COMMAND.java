package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers = {Browsers.CHROME, Browsers.FIREFOX, Browsers.INTERNET_EXPLORER, Browsers.OPERA, Browsers.SAFARI})
public class COMMAND extends HTMLElement {
	
	private static final String ATTRIB_CHECKED = "checked";
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_ICON = "icon";
	private static final String ATTRIB_LABEL = "label";
	private static final String ATTRIB_RADIO_GROUP = "radiogroup";
	private static final String ATTRIB_TYPE = "type";
	

	public COMMAND(Object... children) {
		super("command", children);
	}

	public COMMAND() {
		super("command");
	}
	
	public void setChecked(String checked) {
		set(ATTRIB_CHECKED , checked);
	}
	
	public String getChecked() {
		return get(ATTRIB_CHECKED);
	}
	
	public void setDisabled(String disabled) {
		set(ATTRIB_DISABLED , disabled);
	}
	
	public String getDisabled() {
		return get(ATTRIB_DISABLED);
	}
	
	public void setIcon(String icon) {
		set(ATTRIB_ICON , icon);
	}
	
	public String getIcon() {
		return get(ATTRIB_ICON);
	}
	
	public void setLabel(String label) {
		set(ATTRIB_LABEL , label);
	}
	
	public String getLabel() {
		return get(ATTRIB_LABEL);
	}
	
	public void setRadioGroup(String radiogroup) {
		set(ATTRIB_RADIO_GROUP , radiogroup);
	}
	
	public String getRadioGroup() {
		return get(ATTRIB_RADIO_GROUP);
	}
	
	public void setType(String type) {
		set(ATTRIB_TYPE , type);
	}
	
	public String getType() {
		return get(ATTRIB_TYPE);
	}
	


}
