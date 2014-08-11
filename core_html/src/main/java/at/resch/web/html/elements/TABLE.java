package at.resch.web.html.elements;

public class TABLE extends HTMLElement {

	private static final String ATTRIB_SORTABLE = "sortable";

	public TABLE(Object... children) {
		super("table", children);
	}

	public TABLE() {
		super("table");
	}

	public void setSortable(String sortable) {
		set(ATTRIB_SORTABLE, sortable);
	}

	public String getSortable() {
		return get(ATTRIB_SORTABLE);
	}

}
