package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.FULL)
public class DIV extends HTMLElement {

	public DIV(Object... children) {
		super("div", children);
	}

	public DIV() {
		super("div");
	}

}
