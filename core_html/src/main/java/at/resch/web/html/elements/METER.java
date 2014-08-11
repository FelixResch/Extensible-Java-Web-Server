package at.resch.web.html.elements;

import at.resch.web.html.annotations.NotSupportedInBrowsers;

@NotSupportedInBrowsers
public class METER extends HTMLElement {

	private static final String ATTRIB_FORM = "form";
	private static final String ATTRIB_HIGH = "high";
	private static final String ATTRIB_LOW = "low";
	private static final String ATTRIB_MAX = "max";
	private static final String ATTRIB_MIN = "min";
	private static final String ATTRIB_OPTIMUM = "optimum";
	private static final String ATTRIB_VALUE = "value";

	public METER(Object... children) {
		super("meter", children);
	}

	public METER() {
		super("meter");
	}

	public void setForm(String form) {
		set(ATTRIB_FORM, form);
	}

	public String getForm() {
		return get(ATTRIB_FORM);
	}

	public void setHigh(String high) {
		set(ATTRIB_HIGH, high);
	}

	public String getHigh() {
		return get(ATTRIB_HIGH);
	}

	public void setLow(String low) {
		set(ATTRIB_LOW, low);
	}

	public String getLow() {
		return get(ATTRIB_LOW);
	}

	public void setMax(String max) {
		set(ATTRIB_MAX, max);
	}

	public String getMax() {
		return get(ATTRIB_MAX);
	}

	public void setMin(String min) {
		set(ATTRIB_MIN, min);
	}

	public String getMin() {
		return get(ATTRIB_MIN);
	}

	public void setOptimum(String optimum) {
		set(ATTRIB_OPTIMUM, optimum);
	}

	public String getOptimum() {
		return get(ATTRIB_OPTIMUM);
	}

	public void setValue(String value) {
		set(ATTRIB_VALUE, value);
	}

	public String getValue() {
		return get(ATTRIB_VALUE);
	}

}
