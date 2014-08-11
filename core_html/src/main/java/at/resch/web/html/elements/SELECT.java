package at.resch.web.html.elements;

public class SELECT extends HTMLElement {

	private static final String ATTRIB_AUTOFOCUS = "autofocus";
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_MULTIPLE = "multiple";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_REQUIRED = "required";
	private static final String ATTRIB_SIZE = "size";

	public SELECT(Object... children) {
		super("select", children);
	}

	public SELECT() {
		super("select");
	}

	public void setAutofocus(String autofocus) {
		set(ATTRIB_AUTOFOCUS, autofocus);
	}

	public String getAutofocus() {
		return get(ATTRIB_AUTOFOCUS);
	}

	public void setDisabled(String disabled) {
		set(ATTRIB_DISABLED, disabled);
	}

	public String getDisabled() {
		return get(ATTRIB_DISABLED);
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

	public void setMultiple(String multiple) {
		set(ATTRIB_MULTIPLE, multiple);
	}

	public String getMultiple() {
		return get(ATTRIB_MULTIPLE);
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

	public void setRequired(String required) {
		set(ATTRIB_REQUIRED, required);
	}

	public String getRequired() {
		return get(ATTRIB_REQUIRED);
	}

	public void setSize(String size) {
		set(ATTRIB_SIZE, size);
	}

	public String getSize() {
		return get(ATTRIB_SIZE);
	}

}
