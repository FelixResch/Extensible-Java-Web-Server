package at.resch.web.html.elements;

public class A extends HTMLElement {

	private static final String ATTRIB_DOWNLOAD = "download";
	private static final String ATTRIB_HREF = "href";
	private static final String ATTRIB_HREFLANG = "hreflang";
	private static final String ATTRIB_MEDIA = "media";
	private static final String ATTRIB_REL = "rel";
	private static final String ATTRIB_TARGET = "target";
	private static final String ATTRIB_TYPE = "type";

	public A(Object... children) {
		super("a", children);
	}

	public A() {
		super("a");
	}

	public void setDownload(String download) {
		set(ATTRIB_DOWNLOAD, download);
	}

	public String getDownload() {
		return get(ATTRIB_DOWNLOAD);
	}

	public void setHref(String href) {
		set(ATTRIB_HREF, href);
	}

	public String getHref() {
		return get(ATTRIB_HREF);
	}

	public void setHreflang(String hreflang) {
		set(ATTRIB_HREFLANG, hreflang);
	}

	public String getHreflang() {
		return get(ATTRIB_HREFLANG);
	}

	public void setMedia(String media) {
		set(ATTRIB_MEDIA, media);
	}

	public String getMedia() {
		return get(ATTRIB_MEDIA);
	}

	public void setRel(String rel) {
		set(ATTRIB_REL, rel);
	}

	public String getRel() {
		return get(ATTRIB_REL);
	}

	public void setTarget(String target) {
		set(ATTRIB_TARGET, target);
	}

	public String getTarget() {
		return get(ATTRIB_TARGET);
	}

	public void setType(String type) {
		set(ATTRIB_TYPE, type);
	}

	public String getType() {
		return get(ATTRIB_TYPE);
	}

}
