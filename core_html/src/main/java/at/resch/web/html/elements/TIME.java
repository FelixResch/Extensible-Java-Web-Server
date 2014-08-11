package at.resch.web.html.elements;

public class TIME extends HTMLElement {

	private static final String ATTRIB_TIME = "time";

	public TIME(Object... children) {
		super("time", children);
	}

	public TIME() {
		super("time");
	}

	public void setTime(String time) {
		set(ATTRIB_TIME, time);
	}

	public String getTime() {
		return get(ATTRIB_TIME);
	}

}
