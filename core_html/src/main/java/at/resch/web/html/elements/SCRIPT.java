package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.FULL)
public class SCRIPT extends HTMLElement {
	
	private static final String ATTRIB_ASYNC = "async";
	private static final String ATTRIB_CHARSET = "charset";
	private static final String ATTRIB_DEFER = "defer";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_TYPE = "type";
	

	public SCRIPT(Object... children) {
		super("script", children);
	}

	public SCRIPT() {
		super("script");
	}	
	
	public void setAsync(String async) {
		set(ATTRIB_ASYNC , async);
	}
	
	public String getAsync() {
		return get(ATTRIB_ASYNC);
	}
	
	public void setCharset(String charset) {
		set(ATTRIB_CHARSET , charset);
	}
	
	public String getCharset() {
		return get(ATTRIB_CHARSET);
	}
	
	public void setDefer(String defer) {
		set(ATTRIB_DEFER , defer);
	}
	
	public String getDefer() {
		return get(ATTRIB_DEFER);
	}
	
	public void setSrc(String src) {
		set(ATTRIB_SRC , src);
	}
	
	public String getSrc() {
		return get(ATTRIB_SRC);
	}
	
	public void setType(String type) {
		set(ATTRIB_TYPE , type);
	}
	
	public String getType() {
		return get(ATTRIB_TYPE);
	}
	

}
