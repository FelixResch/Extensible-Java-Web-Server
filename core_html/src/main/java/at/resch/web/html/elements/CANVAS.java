package at.resch.web.html.elements;

public class CANVAS extends HTMLElement {
	
	private static final String ATTRIB_HEIGHT = "height";
	private static final String ATTRIB_WIDTH = "width";

	public CANVAS(Object... children) {
		super("canvas", children);
	}

	public CANVAS() {
		super("canvas");
	}

	public void setHeight(String height) {
		set(ATTRIB_HEIGHT , height);
	}
	
	public String getHeight() {
		return get(ATTRIB_HEIGHT);
	}
	
	public void setWidth(String width) {
		set(ATTRIB_WIDTH , width);
	}
	
	public String getWidth() {
		return get(ATTRIB_WIDTH);
	}
	

	
}
