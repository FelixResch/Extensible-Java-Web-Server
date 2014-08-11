package at.resch.web.html.elements;

public class INPUT extends HTMLElement {

	private static final String ATTRIB_ACCEPT = "accept";
	private static final String ATTRIB_ALT = "alt";
	private static final String ATTRIB_AUTO_COMPLETE = "autocomplete";
	private static final String ATTRIB_AUTO_FOCUS = "autofocus";
	private static final String ATTRIB_CHECKED = "checked";
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_FORM_ACTION = "formaction";
	private static final String ATTRIB_FORM_ENCTYPE = "formenctype";
	private static final String ATTRIB_FORM_METHOD = "formmethod";
	private static final String ATTRIB_FORM_NO_VALIDATE = "formnovalidate";
	private static final String ATTRIB_FORM_TARGET = "formtarget";
	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_LIST = "list";
	private static final String ATTRIB_MAX = "max";
	private static final String ATTRIB_MAX_LENGTH = "maxlength";
	private static final String ATTRIB_MIN = "min";
	private static final String ATTRIB_MULTIPLE = "multiple";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_PATTERN = "pattern";
	private static final String ATTRIB_PLACEHOLDER = "placeholder";
	private static final String ATTRIB_READ_ONLY = "readonly";
	private static final String ATTRIB_REQUIRED = "required";
	private static final String ATTRIB_SIZE = "size";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_STEP = "step";
	private static final String ATTRIB_TYPE = "type";
	private static final String ATTRIB_VALUE = "value";
	private static final String ATTRIB_WIDTH = "width";

	public INPUT(Object... children) {
		super("input", children);
	}

	public INPUT() {
		super("input");
	}

	public void setAccept(String accept) {
		set(ATTRIB_ACCEPT, accept);
	}

	public String getAccept() {
		return get(ATTRIB_ACCEPT);
	}

	public void setAlt(String alt) {
		set(ATTRIB_ALT, alt);
	}

	public String getAlt() {
		return get(ATTRIB_ALT);
	}

	public void setAutoComplete(String autocomplete) {
		set(ATTRIB_AUTO_COMPLETE, autocomplete);
	}

	public String getAutoComplete() {
		return get(ATTRIB_AUTO_COMPLETE);
	}

	public void setAutoFocus(String autofocus) {
		set(ATTRIB_AUTO_FOCUS, autofocus);
	}

	public String getAutoFocus() {
		return get(ATTRIB_AUTO_FOCUS);
	}

	public void setChecked(String checked) {
		set(ATTRIB_CHECKED, checked);
	}

	public String getChecked() {
		return get(ATTRIB_CHECKED);
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

	public void setFormAction(String formaction) {
		set(ATTRIB_FORM_ACTION, formaction);
	}

	public String getFormAction() {
		return get(ATTRIB_FORM_ACTION);
	}

	public void setFormEnctype(String formenctype) {
		set(ATTRIB_FORM_ENCTYPE, formenctype);
	}

	public String getFormEnctype() {
		return get(ATTRIB_FORM_ENCTYPE);
	}

	public void setFormMethod(String formmethod) {
		set(ATTRIB_FORM_METHOD, formmethod);
	}

	public String getFormMethod() {
		return get(ATTRIB_FORM_METHOD);
	}

	public void setFormNoValidate(String formnovalidate) {
		set(ATTRIB_FORM_NO_VALIDATE, formnovalidate);
	}

	public String getFormNoValidate() {
		return get(ATTRIB_FORM_NO_VALIDATE);
	}

	public void setFormTarget(String formtarget) {
		set(ATTRIB_FORM_TARGET, formtarget);
	}

	public String getFormTarget() {
		return get(ATTRIB_FORM_TARGET);
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT, height);
	}

	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}

	public void setList(String list) {
		set(ATTRIB_LIST, list);
	}

	public String getList() {
		return get(ATTRIB_LIST);
	}

	public void setMax(String max) {
		set(ATTRIB_MAX, max);
	}

	public String getMax() {
		return get(ATTRIB_MAX);
	}

	public void setMaxLength(String maxlength) {
		set(ATTRIB_MAX_LENGTH, maxlength);
	}

	public String getMaxLength() {
		return get(ATTRIB_MAX_LENGTH);
	}

	public void setMin(String min) {
		set(ATTRIB_MIN, min);
	}

	public String getMin() {
		return get(ATTRIB_MIN);
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

	public void setPattern(String pattern) {
		set(ATTRIB_PATTERN, pattern);
	}

	public String getPattern() {
		return get(ATTRIB_PATTERN);
	}

	public void setPlaceholder(String placeholder) {
		set(ATTRIB_PLACEHOLDER, placeholder);
	}

	public String getPlaceholder() {
		return get(ATTRIB_PLACEHOLDER);
	}

	public void setReadOnly(String readonly) {
		set(ATTRIB_READ_ONLY, readonly);
	}

	public String getReadOnly() {
		return get(ATTRIB_READ_ONLY);
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

	public void setSrc(String src) {
		set(ATTRIB_SRC, src);
	}

	public String getSrc() {
		return get(ATTRIB_SRC);
	}

	public void setStep(String step) {
		set(ATTRIB_STEP, step);
	}

	public String getStep() {
		return get(ATTRIB_STEP);
	}

	public void setType(String type) {
		set(ATTRIB_TYPE, type);
	}

	public String getType() {
		return get(ATTRIB_TYPE);
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

	public void setWidth(String width) {
		set(ATTRIB_WIDTH, width);
	}

	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}

}
