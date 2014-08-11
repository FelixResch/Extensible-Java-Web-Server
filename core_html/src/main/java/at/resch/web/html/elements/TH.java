package at.resch.web.html.elements;

public class TH extends HTMLElement {

	private static final String ATTRIB_ABBR = "abbr";
	private static final String ATTRIB_COLSPAN = "colspan";
	private static final String ATTRIB_HEADERS = "headers";
	private static final String ATTRIB_ROWSPAN = "rowspan";
	private static final String ATTRIB_SCOPE = "scope";
	private static final String ATTRIB_SORTED = "sorted";

	public TH(Object... children) {
		super("th", children);
	}

	public TH() {
		super("th");
	}

	public void setAbbr(String abbr) {
		set(ATTRIB_ABBR, abbr);
	}

	public String getAbbr() {
		return get(ATTRIB_ABBR);
	}

	public void setColspan(String colspan) {
		set(ATTRIB_COLSPAN, colspan);
	}

	public String getColspan() {
		return get(ATTRIB_COLSPAN);
	}

	public void setHeaders(String headers) {
		set(ATTRIB_HEADERS, headers);
	}

	public String getHeaders() {
		return get(ATTRIB_HEADERS);
	}

	public void setRowspan(String rowspan) {
		set(ATTRIB_ROWSPAN, rowspan);
	}

	public String getRowspan() {
		return get(ATTRIB_ROWSPAN);
	}

	public void setScope(String scope) {
		set(ATTRIB_SCOPE, scope);
	}

	public String getScope() {
		return get(ATTRIB_SCOPE);
	}

	public void setSorted(String sorted) {
		set(ATTRIB_SORTED, sorted);
	}

	public String getSorted() {
		return get(ATTRIB_SORTED);
	}

}
