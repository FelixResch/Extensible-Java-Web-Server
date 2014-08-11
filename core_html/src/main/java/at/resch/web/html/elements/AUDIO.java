package at.resch.web.html.elements;

public class AUDIO extends HTMLMedia {
	
	private static final String ATTRIB_AUTOPLAY = "autoplay";
	private static final String ATTRIB_CONTROLS = "controls";
	private static final String ATTRIB_LOOP = "loop";
	private static final String ATTRIB_MUTED = "muted";
	private static final String ATTRIB_PRELOAD = "preload";
	private static final String ATTRIB_SRC = "src";

	public AUDIO(Object... children) {
		super("audio", children);
	}

	public AUDIO() {
		super("audio");
	}

	public void setAutoplay(String autoplay) {
		set(ATTRIB_AUTOPLAY , autoplay);
	}
	
	public String getAutoplay() {
		return get(ATTRIB_AUTOPLAY);
	}
	
	public void setControls(String controls) {
		set(ATTRIB_CONTROLS , controls);
	}
	
	public String getControls() {
		return get(ATTRIB_CONTROLS);
	}
	
	public void setLoop(String loop) {
		set(ATTRIB_LOOP , loop);
	}
	
	public String getLoop() {
		return get(ATTRIB_LOOP);
	}
	
	public void setMuted(String muted) {
		set(ATTRIB_MUTED , muted);
	}
	
	public String getMuted() {
		return get(ATTRIB_MUTED);
	}
	
	public void setPreload(String preload) {
		set(ATTRIB_PRELOAD , preload);
	}
	
	public String getPreload() {
		return get(ATTRIB_PRELOAD);
	}
	
	public void setSrc(String src) {
		set(ATTRIB_SRC , src);
	}
	
	public String getSrc() {
		return get(ATTRIB_SRC);
	}
	

	
}
