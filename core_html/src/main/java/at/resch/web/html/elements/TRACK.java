package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;
import at.resch.web.html.enums.Browsers;

@NotSupportedInBrowsers(browsers={Browsers.FIREFOX, Browsers.SAFARI})
public class TRACK extends HTMLMedia {

	private static final String ATTRIB_DEFAULT = "default";
	private static final String ATTRIB_KIND = "kind";
	private static final String ATTRIB_LABEL = "label";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_SRCLANG = "srclang";
	
	public TRACK(Object... children) {
		super("track", children);
	}

	public TRACK() {
		super("track");
	}
	
	public void setDefault(String default_) {
		set(ATTRIB_DEFAULT , default_);
	}
	
	public String getDefault() {
		return get(ATTRIB_DEFAULT);
	}
	
	public void setKind(String kind) {
		set(ATTRIB_KIND , kind);
	}
	
	public String getKind() {
		return get(ATTRIB_KIND);
	}
	
	public void setLabel(String label) {
		set(ATTRIB_LABEL , label);
	}
	
	public String getLabel() {
		return get(ATTRIB_LABEL);
	}
	
	public void setSrc(String src) {
		set(ATTRIB_SRC , src);
	}
	
	public String getSrc() {
		return get(ATTRIB_SRC);
	}
	
	public void setSrclang(String srclang) {
		set(ATTRIB_SRCLANG , srclang);
	}
	
	public String getSrclang() {
		return get(ATTRIB_SRCLANG);
	}
	


}
