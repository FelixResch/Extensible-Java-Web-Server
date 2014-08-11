package at.resch.web.html.elements;

public class LI extends HTMLElement {

	private static final String ATTRIB_VALUE = "value";

	public LI(Object... children) {
		super("li", children);
	}

	public LI() {
		super("li");
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

}
