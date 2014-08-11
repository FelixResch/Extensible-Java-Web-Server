package at.resch.web.html.elements;

public class STYLE extends HTMLElement {
	
	private static final String ATTRIB_MEDIA = "media";
	private static final String ATTRIB_SCOPED = "scoped";
	private static final String ATTRIB_TYPE = "type";

	public STYLE(Object... children) {
		super("style", children);
	}

	public STYLE() {
		super("style");
	}

	public void setMedia(String media) {
		set(ATTRIB_MEDIA , media);
	}
	
	public String getMedia() {
		return get(ATTRIB_MEDIA);
	}
	
	public void setScoped(String scoped) {
		set(ATTRIB_SCOPED , scoped);
	}
	
	public String getScoped() {
		return get(ATTRIB_SCOPED);
	}
	
	public void setType(String type) {
		set(ATTRIB_TYPE , type);
	}
	
	public String getType() {
		return get(ATTRIB_TYPE);
	}
	
	
}
