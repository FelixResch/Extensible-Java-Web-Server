package at.resch.web.html.elements;

public class Q extends HTMLElement {

	private static final String ATTRIB_CITE = "cite";

	public Q(Object... children) {
		super("q", children);
	}

	public Q() {
		super("q");
	}

	public void setCite(String cite) {
		set(ATTRIB_CITE, cite);
	}

	public String getCite() {
		return get(ATTRIB_CITE);
	}

}
