package at.resch.web.html.elements;

public class FIELDSET extends HTMLElement {
	
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_NAME = "name";

	public FIELDSET(Object... children) {
		super("fieldset", children);
	}

	public FIELDSET() {
		super("fieldset");
	}
	
	public void setDisabled(String disabled) {
		set(ATTRIB_DISABLED , disabled);
	}
	
	public String getDisabled() {
		return get(ATTRIB_DISABLED);
	}
	
	public void setForm(String form) {
		set(ATTRIB_FORM , form);
	}
	
	public String getForm() {
		return get(ATTRIB_FORM);
	}
	
	public void setName(String name) {
		set(ATTRIB_NAME , name);
	}
	
	public String getName() {
		return get(ATTRIB_NAME);
	}
	


}
