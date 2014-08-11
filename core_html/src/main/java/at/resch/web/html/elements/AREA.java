package at.resch.web.html.elements;

public class AREA extends A {
	
	private static final String ATTRIB_ALT = "alt";
	private static final String ATTRIB_COORDS = "coords";
	private static final String ATTRIB_SHAPE = "shape";

	public AREA(Object... children) {
		super(children);
		setTagName("area");
	}

	public AREA() {
		setTagName("area");
	}

	public void setAlt(String alt) {
		set(ATTRIB_ALT , alt);
	}
	
	public String getAlt() {
		return get(ATTRIB_ALT);
	}
	
	public void setCoords(String coords) {
		set(ATTRIB_COORDS , coords);
	}
	
	public String getCoords() {
		return get(ATTRIB_COORDS);
	}
	
	public void setShape(String shape) {
		set(ATTRIB_SHAPE , shape);
	}
	
	public String getShape() {
		return get(ATTRIB_SHAPE);
	}
	

	
}
