package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.FULL)
public class LABEL extends HTMLElement {

	private static final String ATTRIB_FOR = "for";
	private static final String ATTRIB_FORM = "form";

	public LABEL(Object... children) {
		super("label", children);
	}

	public LABEL() {
		super("label");
	}

	public void setFor(String for_) {
		set(ATTRIB_FOR, for_);
	}

	public String getFor() {
		return get(ATTRIB_FOR);
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

}
