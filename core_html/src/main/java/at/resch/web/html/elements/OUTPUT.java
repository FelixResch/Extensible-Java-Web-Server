package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;

@NotSupportedInBrowsers
public class OUTPUT extends HTMLElement {

	private static final String ATTRIB_FOR = "for";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_NAME = "name";

	public OUTPUT(Object... children) {
		super("output", children);
	}

	public OUTPUT() {
		super("output");
	}

	public void setFor(String for_) {
		set(ATTRIB_FOR, for_);
	}

	public String getFor() {
		return get(ATTRIB_FOR);
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

}
