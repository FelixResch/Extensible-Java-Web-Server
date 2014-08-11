package at.resch.web.html.elements;

public class OBJECT extends HTMLElement {

	private static final String ATTRIB_DATA = "data";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_TYPE = "type";
	private static final String ATTRIB_USE_MAP = "usemap";
	private static final String ATTRIB_WIDTH = "width";

	public OBJECT(Object... children) {
		super("object", children);
	}

	public OBJECT() {
		super("object");
	}

	public void setData(String data) {
		set(ATTRIB_DATA, data);
	}

	public String getData() {
		return get(ATTRIB_DATA);
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT, height);
	}

	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

	public void setType(String type) {
		set(ATTRIB_TYPE, type);
	}

	public String getType() {
		return get(ATTRIB_TYPE);
	}

	public void setUseMap(String usemap) {
		set(ATTRIB_USE_MAP, usemap);
	}

	public String getUseMap() {
		return get(ATTRIB_USE_MAP);
	}

	public void setWidth(String width) {
		set(ATTRIB_WIDTH, width);
	}

	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}

}
