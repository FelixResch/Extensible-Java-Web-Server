package at.resch.web.html.elements;

public class IMG extends HTMLMedia {

	private static final String ATTRIB_ALT = "alt";
	private static final String ATTRIB_CROSS_ORIGIN = "crossorigin";
	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_IS_MAP = "ismap";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_USE_MAP = "usemap";
	private static final String ATTRIB_WIDTH = "width";

	public IMG(Object... children) {
		super("img", children);
	}

	public IMG(String tagName) {
		super("img");
	}

	public void setAlt(String alt) {
		set(ATTRIB_ALT, alt);
	}

	public String getAlt() {
		return get(ATTRIB_ALT);
	}

	public void setCrossOrigin(String crossorigin) {
		set(ATTRIB_CROSS_ORIGIN, crossorigin);
	}

	public String getCrossOrigin() {
		return get(ATTRIB_CROSS_ORIGIN);
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT, height);
	}

	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}

	public void setIsMap(String ismap) {
		set(ATTRIB_IS_MAP, ismap);
	}

	public String getIsMap() {
		return get(ATTRIB_IS_MAP);
	}

	public void setSrc(String src) {
		set(ATTRIB_SRC, src);
	}

	public String getSrc() {
		return get(ATTRIB_SRC);
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
