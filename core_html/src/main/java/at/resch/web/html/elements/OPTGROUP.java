package at.resch.web.html.elements;

public class OPTGROUP extends HTMLElement {

	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_LABEL = "label";

	public OPTGROUP(Object... children) {
		super("optgroup", children);
	}

	public OPTGROUP() {
		super("optgroup");
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

}
