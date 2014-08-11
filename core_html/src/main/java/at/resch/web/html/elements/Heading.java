package at.resch.web.html.elements;

import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.FULL)
public class Heading extends HTMLElement{

	private static final String ATTRIB_ALIGN = "align";
	
	private int level;
	
	
	public Heading(int level) {
		super("h" + level);
		this.setLevel(level);
	}

	public Heading(int level, Object... children) {
		super("h" + level, children);
		setLevel(level);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		setTagName("h" + level);
		this.level = level;
	}
	
	public void setAlign(String align) {
		set(ATTRIB_ALIGN, align);
	}
	
	public String getAlign() {
		return get(ATTRIB_ALIGN);
	}

}
