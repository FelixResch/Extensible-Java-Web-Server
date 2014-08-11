package at.resch.web.html.elements;

public class BASE extends HTMLElement {

	private static final String ATTRIB_HREF = "href";
	private static final String ATTRIB_TARGET = "target";
	
	public BASE(Object... children) {
		super("base", children);
	}

	public BASE() {
		super("base");
	}
	
	public void setHref(String href) {
		set(ATTRIB_HREF , href);
	}
	
	public String getHref() {
		return get(ATTRIB_HREF);
	}
	
	public void setTarget(String target) {
		set(ATTRIB_TARGET , target);
	}
	
	public String getTarget() {
		return get(ATTRIB_TARGET);
	}

}
