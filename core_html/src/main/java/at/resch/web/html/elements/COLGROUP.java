package at.resch.web.html.elements;

public class COLGROUP extends HTMLElement {

	private static final String ATTRIB_SPAN = "span";
	
	public COLGROUP(Object... children) {
		super("colgroup", children);
	}

	public COLGROUP() {
		super("colgroup");
	}
	
	public void setSpan(String span) {
		set(ATTRIB_SPAN , span);
	}
	
	public String getSpan() {
		return get(ATTRIB_SPAN);
	}
	


}
