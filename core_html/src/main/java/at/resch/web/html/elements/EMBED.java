package at.resch.web.html.elements;

public class EMBED extends HTMLMedia {

	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_TYPE = "type";
	private static final String ATTRIB_WIDTH = "width";

	public EMBED(Object... children) {
		super("embed", children);
	}

	public EMBED() {
		super("embed");
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT, height);
	}

	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}

	public void setSrc(String src) {
		set(ATTRIB_SRC, src);
	}

	public String getSrc() {
		return get(ATTRIB_SRC);
	}

	public void setType(String type) {
		set(ATTRIB_TYPE, type);
	}

	public String getType() {
		return get(ATTRIB_TYPE);
	}

	public void setWidth(String width) {
		set(ATTRIB_WIDTH, width);
	}

	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}

}
