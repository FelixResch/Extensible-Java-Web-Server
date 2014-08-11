package at.resch.web.html.elements;

public class SOURCE extends HTMLMedia {

	private static final String ATTRIB_MEDIA = "media";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_TYPE = "type";

	public SOURCE(Object... children) {
		super("source", children);
	}

	public SOURCE(String tagName) {
		super("source");
	}

	public void setMedia(String media) {
		set(ATTRIB_MEDIA, media);
	}

	public String getMedia() {
		return get(ATTRIB_MEDIA);
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

}
