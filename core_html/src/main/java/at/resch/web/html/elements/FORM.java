package at.resch.web.html.elements;

public class FORM extends HTMLElement {

	private static final String ATTRIB_ACCEPT_CHARSET = "accept-charset";
	private static final String ATTRIB_ACTION = "action";
	private static final String ATTRIB_AUTO_COMPLETE = "autocomplete";
	private static final String ATTRIB_ENCTYPE = "enctype";
	private static final String ATTRIB_METHOD = "method";
	private static final String ATTRIB_NAME = "name";
	private static final String ATTRIB_NO_VALIDATE = "novalidate";
	private static final String ATTRIB_TARGET = "target";
	
	public FORM(Object... children) {
		super("form", children);
	}

	public FORM() {
		super("form");
	}
	
	public void setAcceptCharset(String accept_charset) {
		set(ATTRIB_ACCEPT_CHARSET , accept_charset);
	}
	
	public String getAcceptCharset() {
		return get(ATTRIB_ACCEPT_CHARSET);
	}
	
	public void setAction(String action) {
		set(ATTRIB_ACTION , action);
	}
	
	public String getAction() {
		return get(ATTRIB_ACTION);
	}
	
	public void setAutoComplete(String autocomplete) {
		set(ATTRIB_AUTO_COMPLETE , autocomplete);
	}
	
	public String getAutoComplete() {
		return get(ATTRIB_AUTO_COMPLETE);
	}
	
	public void setEnctype(String enctype) {
		set(ATTRIB_ENCTYPE , enctype);
	}
	
	public String getEnctype() {
		return get(ATTRIB_ENCTYPE);
	}
	
	public void setMethod(String method) {
		set(ATTRIB_METHOD , method);
	}
	
	public String getMethod() {
		return get(ATTRIB_METHOD);
	}
	
	public void setName(String name) {
		set(ATTRIB_NAME , name);
	}
	
	public String getName() {
		return get(ATTRIB_NAME);
	}
	
	public void setNoValidate(String novalidate) {
		set(ATTRIB_NO_VALIDATE , novalidate);
	}
	
	public String getNoValidate() {
		return get(ATTRIB_NO_VALIDATE);
	}
	
	public void setTarget(String target) {
		set(ATTRIB_TARGET , target);
	}
	
	public String getTarget() {
		return get(ATTRIB_TARGET);
	}
	


}
