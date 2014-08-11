package at.resch.web.html.elements;

public class COL extends HTMLElement {
	
	private static final String ATTRIB_SPAN = "span";

	public COL(Object... children) {
		super("col", children);
	}

	public COL() {
		super("col");
	}
	
	public void setSpan(String span) {
		set(ATTRIB_SPAN , span);
	}
	
	public String getSpan() {
		return get(ATTRIB_SPAN);
	}
	


}
