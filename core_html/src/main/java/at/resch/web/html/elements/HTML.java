package at.resch.web.html.elements;

public class HTML extends HTMLElement {

	private static final String ATTRIB_MANIFEST = "manifest";
	private static final String ATTRIB_XMLNS = "xmlns";
	
	public HTML() {
		super("html");
	}

	public HTML(Object... children) {
		super("html", children);
	}
	
	public void setManifest(String manifest) {
		set(ATTRIB_MANIFEST , manifest);
	}
	
	public String getManifest() {
		return get(ATTRIB_MANIFEST);
	}
	
	public void setXmlns(String xmlns) {
		set(ATTRIB_XMLNS , xmlns);
	}
	
	public String getXmlns() {
		return get(ATTRIB_XMLNS);
	}
	

}
