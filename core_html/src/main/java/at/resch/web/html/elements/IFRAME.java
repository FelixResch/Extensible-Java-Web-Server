package at.resch.web.html.elements;

public class IFRAME extends HTMLElement {

	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_SANDBOX = "sandbox";
	private static final String ATTRIB_SEAMLESS = "seamless";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_SRC_DOC = "scrdoc";
	private static final String ATTRIB_WIDTH = "width";

	public IFRAME(Object... children) {
		super("iframe", children);
	}

	public IFRAME() {
		super("iframe");
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

	public void setSandbox(String sandbox) {
		set(ATTRIB_SANDBOX, sandbox);
	}

	public String getSandbox() {
		return get(ATTRIB_SANDBOX);
	}

	public void setSeamless(String seamless) {
		set(ATTRIB_SEAMLESS, seamless);
	}

	public String getSeamless() {
		return get(ATTRIB_SEAMLESS);
	}

	public void setSrc(String src) {
		set(ATTRIB_SRC, src);
	}

	public String getSrc() {
		return get(ATTRIB_SRC);
	}

	public void setSrcDoc(String scrdoc) {
		set(ATTRIB_SRC_DOC, scrdoc);
	}

	public String getSrcDoc() {
		return get(ATTRIB_SRC_DOC);
	}

	public void setWidth(String width) {
		set(ATTRIB_WIDTH, width);
	}

	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}

}
