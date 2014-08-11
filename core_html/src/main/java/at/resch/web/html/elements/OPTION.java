package at.resch.web.html.elements;

public class OPTION extends HTMLElement {

	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_LABEL = "label";
	private static final String ATTRIB_SELECTED = "selected";
	private static final String ATTRIB_VALUE = "value";

	public OPTION(Object... children) {
		super("option", children);
	}

	public OPTION() {
		super("option");
	}

	public void setDisabled(String disabled) {
		set(ATTRIB_DISABLED, disabled);
	}

	public String getDisabled() {
		return get(ATTRIB_DISABLED);
	}

	public void setLabel(String label) {
		set(ATTRIB_LABEL, label);
	}

	public String getLabel() {
		return get(ATTRIB_LABEL);
	}

	public void setSelected(String selected) {
		set(ATTRIB_SELECTED, selected);
	}

	public String getSelected() {
		return get(ATTRIB_SELECTED);
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

}
