package at.resch.web.html.elements;

public class VIDEO extends HTMLMedia {

	private static final String ATTRIB_AUTOPLAY = "autoplay";
	private static final String ATTRIB_CONTROLS = "controls";
	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_LOOP = "loop";
	private static final String ATTRIB_MUTED = "muted";
	private static final String ATTRIB_POSTED = "poster";
	private static final String ATTRIB_PRELOAD = "preload";
	private static final String ATTRIB_SRC = "src";
	private static final String ATTRIB_WIDTH = "width";

	public VIDEO(Object... children) {
		super("video", children);
	}

	public VIDEO() {
		super("video");
	}

	public void setAutoplay(String autoplay) {
		set(ATTRIB_AUTOPLAY, autoplay);
	}

	public String getAutoplay() {
		return get(ATTRIB_AUTOPLAY);
	}

	public void setControls(String controls) {
		set(ATTRIB_CONTROLS, controls);
	}

	public String getControls() {
		return get(ATTRIB_CONTROLS);
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT, height);
	}

	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}

	public void setLoop(String loop) {
		set(ATTRIB_LOOP, loop);
	}

	public String getLoop() {
		return get(ATTRIB_LOOP);
	}

	public void setMuted(String muted) {
		set(ATTRIB_MUTED, muted);
	}

	public String getMuted() {
		return get(ATTRIB_MUTED);
	}

	public void setPosted(String poster) {
		set(ATTRIB_POSTED, poster);
	}

	public String getPosted() {
		return get(ATTRIB_POSTED);
	}

	public void setPreload(String preload) {
		set(ATTRIB_PRELOAD, preload);
	}

	public String getPreload() {
		return get(ATTRIB_PRELOAD);
	}

	public void setSrc(String src) {
		set(ATTRIB_SRC, src);
	}

	public String getSrc() {
		return get(ATTRIB_SRC);
	}

	public void setWidth(String width) {
		set(ATTRIB_WIDTH, width);
	}

	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}

}
