package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.FULL)
public class PROGRESS extends HTMLElement {

	private static final String ATTRIB_MAX = "max";
	private static final String ATTRIB_VALUE = "value";

	public PROGRESS(Object... children) {
		super("progress", children);
	}

	public PROGRESS() {
		super("progress");
	}

	public void setMax(String max) {
		set(ATTRIB_MAX, max);
	}

	public String getMax() {
		return get(ATTRIB_MAX);
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

}
