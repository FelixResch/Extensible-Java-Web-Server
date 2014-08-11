package at.resch.web.html.elements;

public class BDO extends HTMLElement {
	
	private static final String ATTRIB_DIR = "dir";

	public BDO(Object... children) {
		super("bdo", children);
	}

	public BDO() {
		super("bdo");
	}

	public void setDir(String dir) {
		set(ATTRIB_DIR , dir);
	}
	
	public String getDir() {
		return get(ATTRIB_DIR);
	}

	
}
