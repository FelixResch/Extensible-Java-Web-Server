package at.resch.web.html.elements;

public class BLOCKQUOTE extends HTMLElement {

	private static final String ATTRIB_CITE = "cite";

	public BLOCKQUOTE(Object... children) {
		super("blockquote", children);
	}

	public BLOCKQUOTE() {
		super("blockquote");
	}

	public void setCite(String cite) {
		set(ATTRIB_CITE, cite);
	}

	public String getCite() {
		return get(ATTRIB_CITE);
	}

}
