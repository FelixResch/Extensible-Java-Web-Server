package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;


@RenderMode(Mode.FULL)
public class SPAN extends HTMLElement {

	public SPAN(Object... children) {
		super("span", children);
	}

	public SPAN() {
		super("span");
	}

}
