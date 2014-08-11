package at.resch.web.html.elements;

public class INS extends HTMLElement {

	private static final String ATTRIB_CITE = "cite";
	private static final String ATTRIB_DATE_TIME = "datetime";

	public INS(Object... children) {
		super("ins", children);
	}

	public INS() {
		super("ins");
	}

	public void setCite(String cite) {
		set(ATTRIB_CITE, cite);
	}

	public String getCite() {
		return get(ATTRIB_CITE);
	}

	public void setDateTime(String datetime) {
		set(ATTRIB_DATE_TIME, datetime);
	}

	public String getDateTime() {
		return get(ATTRIB_DATE_TIME);
	}

}
