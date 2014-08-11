package at.resch.web.html.elements;

public class MAP extends HTMLElement {

	private static final String ATTRIB_NAME = "name";

	public MAP(Object... children) {
		super("map", children);
	}

	public MAP() {
		super("map");
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

}
