package at.resch.web.html.elements;

public class DEL extends HTMLElement {
	
	private static final String ATTRIB_CITE = "cite";
	private static final String ATTRIB_DATE_TIME = "datetime";

	public DEL(Object... children) {
		super("del", children);
	}

	public DEL() {
		super("del");
	}

	public void setCite(String cite) {
		set(ATTRIB_CITE , cite);
	}
	
	public String getCite() {
		return get(ATTRIB_CITE);
	}
	
	public void setDateTime(String datetime) {
		set(ATTRIB_DATE_TIME , datetime);
	}
	
	public String getDateTime() {
		return get(ATTRIB_DATE_TIME);
	}
	

}
