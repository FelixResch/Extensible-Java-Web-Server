package at.resch.web.html.elements;

public class META extends HTMLElement {

	private static final String ATTRIB_CHARSET = "charset";
	private static final String ATTRIB_CONTENT = "content";
	private static final String ATTRIB_HTTP_EQUIV = "http-equiv";
	private static final String ATTRIB_NAME = "name";
	
	public META(Object... children) {
		super("meta", children);
	}

	public META() {
		super("meta");
	}

	public void setCharset(String charset) {
		set(ATTRIB_CHARSET , charset);
	}
	
	public String getCharset() {
		return get(ATTRIB_CHARSET);
	}
	
	public void setContent(String content) {
		set(ATTRIB_CONTENT , content);
	}
	
	public String getContent() {
		return get(ATTRIB_CONTENT);
	}
	
	public void setHttpEquiv(String http_equiv) {
		set(ATTRIB_HTTP_EQUIV , http_equiv);
	}
	
	public String getHttpEquiv() {
		return get(ATTRIB_HTTP_EQUIV);
	}
	
	public void setName(String name) {
		set(ATTRIB_NAME , name);
	}
	
	public String getName() {
		return get(ATTRIB_NAME);
	}
	

}
