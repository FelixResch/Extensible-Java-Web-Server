package at.resch.web.html.elements;

public class TEXTAREA extends HTMLElement {

	private static final String ATTRIB_AUTOFOCUS = "autofocus";
	private static final String ATTRIB_COLS = "cols";
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_MAX_LENGTH = "maxlength";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_PLACEHOLDER = "placeholder";
	private static final String ATTRIB_READONLY = "readonly";
	private static final String ATTRIB_REQUIRED = "required";
	private static final String ATTRIB_ROWS = "rows";
	private static final String ATTRIB_WRAP = "wrap";

	public TEXTAREA(Object... children) {
		super("textarea", children);
	}

	public TEXTAREA() {
		super("textarea");
	}

	public void setAutofocus(String autofocus) {
		set(ATTRIB_AUTOFOCUS, autofocus);
	}

	public String getAutofocus() {
		return get(ATTRIB_AUTOFOCUS);
	}

	public void setCols(String cols) {
		set(ATTRIB_COLS, cols);
	}

	public String getCols() {
		return get(ATTRIB_COLS);
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

	public void setMaxLength(String maxlength) {
		set(ATTRIB_MAX_LENGTH, maxlength);
	}

	public String getMaxLength() {
		return get(ATTRIB_MAX_LENGTH);
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

	public void setPlaceholder(String placeholder) {
		set(ATTRIB_PLACEHOLDER, placeholder);
	}

	public String getPlaceholder() {
		return get(ATTRIB_PLACEHOLDER);
	}

	public void setReadonly(String readonly) {
		set(ATTRIB_READONLY, readonly);
	}

	public String getReadonly() {
		return get(ATTRIB_READONLY);
	}

	public void setRequired(String required) {
		set(ATTRIB_REQUIRED, required);
	}

	public String getRequired() {
		return get(ATTRIB_REQUIRED);
	}

	public void setRows(String rows) {
		set(ATTRIB_ROWS, rows);
	}

	public String getRows() {
		return get(ATTRIB_ROWS);
	}

	public void setWrap(String wrap) {
		set(ATTRIB_WRAP, wrap);
	}

	public String getWrap() {
		return get(ATTRIB_WRAP);
	}

}
