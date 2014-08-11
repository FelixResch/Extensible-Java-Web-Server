package at.resch.web.html;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import at.resch.web.html.enums.Mode;
import at.resch.web.html.annotations.RenderMode;

/**
 * Represents an html tag and can render itself into valid html code (not
 * motionless)
 * 
 * @author felix
 * 
 */
public class HTMLObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6406003066669240539L;

	/**
	 * The name of the html tag
	 */
	private String tagName;

	/**
	 * Create a new html tag
	 * 
	 * @param tagName
	 *            the name of the tag
	 */
	public HTMLObject(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * Create a new html tag and add Objects to it
	 * 
	 * @param tagName
	 *            the name of the tag
	 * @param children
	 *            the objects that should be added to the tag
	 */
	public HTMLObject(String tagName, Object... children) {
		this(tagName);
		for (Object object : children) {							//for simplified rendering attributes are stored in a different list than the other children
			if (object instanceof HTMLAttribute)
				this.attributes.add((HTMLAttribute) object);
			else
				this.children.add(object);
		}
	}

	/**
	 * Method to retrieve all children of the tag
	 * 
	 * @return all children of the tag
	 */
	public List<Object> getChildren() {
		return children;
	}
	/**
	 * Method to retrieve the name of the tag
	 * @return the name of the tag
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * Changes the name of the tag
	 * @param tagName the new name of the tag
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * List to store all children of the tag
	 */
	private List<Object> children = new ArrayList<>();

	/**
	 * List to store all attributes of the tag
	 */
	private List<HTMLAttribute> attributes = new ArrayList<>();

	/**
	 * If an attribute with the same name exists, the value if overwritten with
	 * the new value, else the attribute is added to the attribute list
	 * 
	 * @param a
	 *            the new attribute
	 */
	public void addAttribute(HTMLAttribute a) {
		Iterator<HTMLAttribute> iterator = attributes.iterator();
		while (iterator.hasNext()) {
			HTMLAttribute next = iterator.next();
			if (next.getName().equals(a.getName())) {
				next.setValue(a.getValue());
				return;
			}
		}
		attributes.add(a);
	}

	/**
	 * Removes an attribute by name
	 * 
	 * @param name
	 *            the name of the attribute
	 */
	public void removeAttribute(String name) {
		Iterator<HTMLAttribute> iterator = attributes.iterator();
		while (iterator.hasNext()) {
			HTMLAttribute next = iterator.next();
			if (next.getName().equals(name))
				iterator.remove();
		}
	}

	/**
	 * Looks up the attribute for the given name
	 * 
	 * @param name
	 *            the name of the attribute
	 * @return the attribute, if it exists, null otherwise
	 */
	public HTMLAttribute getAttribute(String name) {
		Iterator<HTMLAttribute> iterator = attributes.iterator();
		while (iterator.hasNext()) {
			HTMLAttribute next = iterator.next();
			if (next.getName().equals(name))
				return next;
		}
		return null;
	}

	/**
	 * Adds an object to the children list.
	 * 
	 * Note: Please be aware, that there is no recursivness check implemented
	 * yet!
	 * 
	 * @param a
	 *            the object to add
	 */
	public void addObject(Object a) {
		children.add(a);
	}

	/**
	 * Removes all children from the tag
	 */
	public void clearChildren() {
		children.clear();
	}

	/**
	 * Renders the tag and its children into valid html
	 * 
	 * @return the html representation of the tag
	 */
	public String renderHTML() {
		String ret = "";
		Mode mode = Mode.NONE;											//Represents the type of tag closing
		if (getClass().isAnnotationPresent(RenderMode.class))			//If tag closes funnily
			mode = getClass().getAnnotation(RenderMode.class).value();
		if (tagName != null) {											//If not HTMLDocument
			ret += "<" + tagName;										//Open tag and add attributes
			if (!attributes.isEmpty()) {
				ret += " ";
				for (HTMLAttribute html : attributes) {
					ret += html.render() + " ";
				}
			}
		}
		if (children.isEmpty() && tagName != null) {					//If empty tag and not HTMLDocument
			switch (mode) {												//Tag closing is mode depending
			case FULL:
				ret += "></" + tagName + ">";
				break;
			case SMOOTH:
				ret += ">";
				break;
			default:
			case HALF:
				ret += "/>";
				break;
			}

		} else if (children.size() == 1 && tagName != null) {			//If only on child: make one liner
			ret += ">";
			for (Object html : children) {
				if (html instanceof HTMLAttribute)
					continue;
				if(html == null) {
					ret += "null";
				} else if (html instanceof HTMLObject) {
					ret += ((HTMLObject) html).renderHTML();
				} else {
					ret += html.toString();
				}
			}
			ret += "</" + tagName + ">";
		} else {														//Else build full tag including children
			if (tagName != null)
				ret += ">\n";
			for (Object html : children) {
				if (html instanceof HTMLAttribute)
					continue;
				if (html instanceof HTMLObject) {
					ret += ((HTMLObject) html).renderHTML() + "\n";
				} else if (html == null) {
					continue;
				} else {
					ret += html.toString() + "\n";
				}
			}
			if (tagName != null)
				ret += "</" + tagName + ">";
		}
		return ret;
	}

}
