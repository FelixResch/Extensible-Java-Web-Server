package at.resch.web.html.elements;

public class LINK extends HTMLElement {

	private static final String ATTRIB_HREF = "href";
	private static final String ATTRIB_HREF_LANG = "hreflang";
	private static final String ATTRIB_MEDIA = "media";
	private static final String ATTRIB_REL = "rel";
	private static final String ATTRIB_SIZES = "sizes";
	private static final String ATTRIB_TYPE = "type";
	
	public LINK(Object... children) {
		super("link", children);
	}

	public LINK() {
		super("link");
	}

	public void setHref(String href) {
		set(ATTRIB_HREF , href);
	}
	
	public String getHref() {
		return get(ATTRIB_HREF);
	}
	
	public void setHrefLang(String hreflang) {
		set(ATTRIB_HREF_LANG , hreflang);
	}
	
	public String getHrefLang() {
		return get(ATTRIB_HREF_LANG);
	}
	
	public void setMedia(String media) {
		set(ATTRIB_MEDIA , media);
	}
	
	public String getMedia() {
		return get(ATTRIB_MEDIA);
	}
	
	public void setRel(String rel) {
		set(ATTRIB_REL , rel);
	}
	
	public String getRel() {
		return get(ATTRIB_REL);
	}
	
	public void setSizes(String sizes) {
		set(ATTRIB_SIZES , sizes);
	}
	
	public String getSizes() {
		return get(ATTRIB_SIZES);
	}
	
	public void setType(String type) {
		set(ATTRIB_TYPE , type);
	}
	
	public String getType() {
		return get(ATTRIB_TYPE);
	}
	
	
}
