package at.resch.web.html.elements;

public class TD extends HTMLElement {
	
	private static final String ATTRIB_COLSPAN = "colspan";
	private static final String ATTRIB_HEADERS = "headers";
	private static final String ATTRIB_ROWSPAN = "rowspan";

	public TD(Object... children) {
		super("td", children);
	}

	public TD() {
		super("td");
	}
	
	public void setColspan(String colspan) {
		set(ATTRIB_COLSPAN , colspan);
	}
	
	public String getColspan() {
		return get(ATTRIB_COLSPAN);
	}
	
	public void setHeaders(String headers) {
		set(ATTRIB_HEADERS , headers);
	}
	
	public String getHeaders() {
		return get(ATTRIB_HEADERS);
	}
	
	public void setRowspan(String rowspan) {
		set(ATTRIB_ROWSPAN , rowspan);
	}
	
	public String getRowspan() {
		return get(ATTRIB_ROWSPAN);
	}
	


}
