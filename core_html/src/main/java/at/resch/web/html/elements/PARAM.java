package at.resch.web.html.elements;

public class PARAM extends HTMLElement {

	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_VALUE = "value";

	public PARAM(Object... children) {
		super("param", children);
	}

	public PARAM() {
		super("param");
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

}
