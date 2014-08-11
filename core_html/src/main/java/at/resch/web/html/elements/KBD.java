package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;

@NotSupportedInBrowsers
public class KBD extends HTMLElement {

	private static final String ATTRIB_AUTO_FOCUS = "autofocus";
	private static final String ATTRIB_CHALLENGE = "challenge";
	private static final String ATTRIB_DISABLED = "disabled";
	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_KEY_TYPE = "keytype";
	private static final String ATTRIB_NAME = "name";

	public KBD(Object... children) {
		super("kbd", children);
	}

	public KBD() {
		super("kbd");
	}

	public void setAutoFocus(String autofocus) {
		set(ATTRIB_AUTO_FOCUS, autofocus);
	}

	public String getAutoFocus() {
		return get(ATTRIB_AUTO_FOCUS);
	}

	public void setChallenge(String challenge) {
		set(ATTRIB_CHALLENGE, challenge);
	}

	public String getChallenge() {
		return get(ATTRIB_CHALLENGE);
	}

	public void setDisabled(String disabled) {
		set(ATTRIB_DISABLED, disabled);
	}

	public String getDisabled() {
		return get(ATTRIB_DISABLED);
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

	public void setKeyType(String keytype) {
		set(ATTRIB_KEY_TYPE, keytype);
	}

	public String getKeyType() {
		return get(ATTRIB_KEY_TYPE);
	}

	public void setName(String name) {
		set(ATTRIB_NAME, name);
	}

	public String getName() {
		return get(ATTRIB_NAME);
	}

}
