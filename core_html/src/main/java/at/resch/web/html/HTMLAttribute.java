package at.resch.web.html;

import java.io.Serializable;

/**
 * Represents an attribute of an html tag and will be rendered to a functioning
 * html attribute
 * 
 * @author felix
 * 
 */
public class HTMLAttribute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8691615985840021547L;
	/**
	 * The name of the attribute
	 */
	private String name;
	/**
	 * The value of the attribute
	 */
	private String value;

	/**
	 * Constructor to create a new html tag attribute
	 * 
	 * @param name
	 *            the name of the attribute
	 * @param value
	 *            the value of the attribute
	 */
	public HTMLAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Renders the html tag attribute
	 * 
	 * @return a String in the format 'name'="'value'"
	 */
	public String render() {
		return name + "=\"" + value + "\"";
	}

	/**
	 * Method to retrieve the name of the attribute
	 * 
	 * @return the name of the tag
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of the attribute
	 * 
	 * @param name
	 *            the new name of the html tag attribute
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to retrieve the current value of the attribute
	 * @return the value of the attribute
	 */
	public String getValue() {
		return value;
	}
	/**
	 * Changes the value of the attribute
	 * @param value the new value of the html tag attribute
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
