package at.resch.web.html.elements;

public class DOCTYPE extends HTMLElement {

	public DOCTYPE(Object... children) {
		super("!at.resch.web.html.elements.DOCTYPE", children);
	}

	public DOCTYPE() {
		super("!at.resch.web.html.elements.DOCTYPE");
	}

	@Override
	public String renderHTML() {
		return "<!at.resch.web.html.elements.DOCTYPE html>";
	}

}
