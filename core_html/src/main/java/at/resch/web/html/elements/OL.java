package at.resch.web.html.elements;

public class OL extends HTMLElement {

	private static final String ATTRIB_REVERSED = "reversed";
	private static final String ATTRIB_START = "start";
	private static final String ATTRIB_TYPE = "type";

	public OL(Object... children) {
		super("ol", children);
	}

	public OL() {
		super("ol");
	}

	public void setReversed(String reversed) {
		set(ATTRIB_REVERSED, reversed);
	}

	public String getReversed() {
		return get(ATTRIB_REVERSED);
	}

	public void setStart(String start) {
		set(ATTRIB_START, start);
	}

	public String getStart() {
		return get(ATTRIB_START);
	}

	public void setType(String type) {
		set(ATTRIB_TYPE, type);
	}

	public String getType() {
		return get(ATTRIB_TYPE);
	}

}
