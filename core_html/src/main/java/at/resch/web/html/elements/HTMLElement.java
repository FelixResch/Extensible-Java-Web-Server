package at.resch.web.html.elements;

import at.resch.web.html.HTMLAttribute;
import at.resch.web.html.HTMLObject;
import at.resch.web.html.annotations.RenderMode;
import at.resch.web.html.enums.Mode;

@RenderMode(Mode.HALF)
public abstract class HTMLElement extends HTMLObject {
	
	private static final String ATTRIB_ACCESS_KEY = "accesskey";
	private static final String ATTRIB_CLASS = "class";
	private static final String ATTRIB_CONTENT_EDITABLE = "contenteditable";
	private static final String ATTRIB_CONTEXT_MENU = "contextmenu";
	private static final String ATTRIB_PREFIX_DATA = "data-";
	private static final String ATTRIB_DRAGGABLE = "draggable";
	private static final String ATTRIB_DROPZONE = "dropzone";
	private static final String ATTRIB_HIDDEN = "hidden";
	private static final String ATTRIB_ID = "id";
	private static final String ATTRIB_LANG = "lang";
	private static final String ATTRIB_SPELLCHECK = "spellcheck";
	private static final String ATTRIB_STYLE = "style";
	private static final String ATTRIB_TAB_INDEX = "tabindex";
	private static final String ATTRIB_TITLE = "title";
	private static final String ATTRIB_TRANSLATE = "translate";
	
	private static final String EVENT_ON_BLUR = "onblur";
	private static final String EVENT_ON_CHANGE = "onchange";
	private static final String EVENT_ON_CONTEXT_MENU = "oncontextmenu";
	private static final String EVENT_ON_FOCUS = "onfocus";
	private static final String EVENT_ON_FORM_CHANGE = "onformchange";
	private static final String EVENT_ON_FORM_IPUT = "onforminput";
	private static final String EVENT_ON_INPUT = "oninput";
	private static final String EVENT_ON_INVALID = "oninvalid";
	private static final String EVENT_ON_RESET = "onreset";
	private static final String EVENT_ON_SELECT = "onselect";
	private static final String EVENT_ON_SUBMIT = "onsubmit";
	private static final String EVENT_ON_KEY_DOWN = "onkeydown";
	private static final String EVENT_ON_KEY_PRESS = "onkeypress";
	private static final String EVENT_ON_KEY_UP = "onkeyup";
	private static final String EVENT_ON_CLICK = "onclick";
	private static final String EVENT_ON_DBL_CLICK = "ondblclick";
	private static final String EVENT_ON_DRAG = "ondrag";
	private static final String EVENT_ON_DRAG_END = "ondragend";
	private static final String EVENT_ON_DRAG_ENTER = "ondragenter";
	private static final String EVENT_ON_DRAG_LEAVE = "ondragleave";
	private static final String EVENT_ON_DRAG_OVER = "ondragover";
	private static final String EVENT_ON_DRAG_START = "ondragstart";
	private static final String EVENT_ON_DROP = "ondrop";
	private static final String EVENT_ON_MOUSE_DOWN = "onmousedown";
	private static final String EVENT_ON_MOUSE_MOVE = "onmousemove";
	private static final String EVENT_ON_MOUSE_OUT = "onmouseout";
	private static final String EVENT_ON_MOUSE_OVER = "onmouseover";
	private static final String EVENT_ON_MOUSE_UP = "onmouseup";
	private static final String EVENT_ON_MOUSE_WHEEL = "onmousewheel";
	private static final String EVENT_ON_SCROLL = "onscroll";

	public HTMLElement(String tagName, Object... children) {
		super(tagName, children);
	}

	public HTMLElement(String tagName) {
		super(tagName);
	}

	public void set(String name, String value) {
		if(value == null)
			removeAttribute(name);
		else
			addAttribute(new HTMLAttribute(name, value));
	}
	
	public String get(String name) {
		HTMLAttribute a = getAttribute(name);
		if(a != null)
			return a.getValue();
		return null;
	}
	
	public void setAccessKey(String accessKey) {
		set(ATTRIB_ACCESS_KEY, accessKey);
	}
	
	public String getAccessKey() {
		return get(ATTRIB_ACCESS_KEY);
	}
	
	public void setStyleClass(String styleClass) {
		set(ATTRIB_CLASS, styleClass);
	}
	
	public String getStyleClass() {
		return get(ATTRIB_CLASS);
	}
	
	public void setContentEditable(String contentEditable) {
		set(ATTRIB_CONTENT_EDITABLE, contentEditable);
	}
	
	public String getContentEditable() {
		return get(ATTRIB_CONTENT_EDITABLE);
	}
	
	public void setContextMenu(String contextMenu) {
		set(ATTRIB_CONTEXT_MENU, contextMenu);
	}
	
	public String getContextMenu() {
		return get(ATTRIB_CONTEXT_MENU);
	}
	
	//TODO Write special methods for data
	
	public void setDraggable(String draggable) {
		set(ATTRIB_DRAGGABLE, draggable);
	}
	
	public String getDraggable() {
		return get(ATTRIB_DRAGGABLE);
	}
	
	public void setDropzone(String dropzone) {
		set(ATTRIB_DROPZONE, dropzone);
	}
	
	public String getDropzone() {
		return get(ATTRIB_DROPZONE);
	}
	
	public void setHidden(String hidden) {
		set(ATTRIB_HIDDEN, hidden);
	}
	
	public String getHidden() {
		return get(ATTRIB_HIDDEN);
	}
	
	public void setId(String id) {
		set(ATTRIB_ID, id);
	}
	
	public String getId() {
		return get(ATTRIB_ID);
	}
	
	public void setLang(String lang) {
		set(ATTRIB_LANG, lang);
	}
	
	public String getLang() {
		return get(ATTRIB_LANG);
	}
	
	public void setSpellcheck(String spellcheck) {
		set(ATTRIB_SPELLCHECK, spellcheck);
	}
	
	public String getSpellcheck() {
		return get(ATTRIB_SPELLCHECK);
	}
	
	//TODO add addStyle method
	
	public void setStyle(String style) {
		set(ATTRIB_STYLE, style);
	}
	
	public String getStyle() {
		return get(ATTRIB_STYLE);
	}
	
	public void setTabIndex(String tabIndex) {
		set(ATTRIB_TAB_INDEX, tabIndex);
	}
	
	public String getTabIndex() {
		return get(ATTRIB_TAB_INDEX);
	}
	
	public void setTitle(String title) {
		set(ATTRIB_TITLE, title);
	}
	
	public String getTitle() {
		return get(ATTRIB_TITLE);
	}
	
	public void setTranslate(String translate) {
		set(ATTRIB_TRANSLATE, translate);
	}
	
	public String getTranslate() {
		return get(ATTRIB_TRANSLATE);
	}
	
	public void setOnBlurHandler(String onblurhandler) {
		set(EVENT_ON_BLUR, onblurhandler);
	}
	
	public String getOnBlurHandler() {
		return get(EVENT_ON_BLUR);
	}
	
	public void setOnChangeHandler(String onchange) {
		set(EVENT_ON_CHANGE , onchange);
	}
	
	public String getOnChangeHandler() {
		return get(EVENT_ON_CHANGE);
	}
	
	public void setOnContextMenuHandler(String oncontextmenu) {
		set(EVENT_ON_CONTEXT_MENU , oncontextmenu);
	}
	
	public String getOnContextMenuHandler() {
		return get(EVENT_ON_CONTEXT_MENU);
	}
	
	public void setOnFocusHandler(String onfocus) {
		set(EVENT_ON_FOCUS , onfocus);
	}
	
	public String getOnFocusHandler() {
		return get(EVENT_ON_FOCUS);
	}
	
	public void setOnFormChangeHandler(String onformchange) {
		set(EVENT_ON_FORM_CHANGE , onformchange);
	}
	
	public String getOnFormChangeHandler() {
		return get(EVENT_ON_FORM_CHANGE);
	}
	
	public void setOnFormIputHandler(String onforminput) {
		set(EVENT_ON_FORM_IPUT , onforminput);
	}
	
	public String getOnFormIputHandler() {
		return get(EVENT_ON_FORM_IPUT);
	}
	
	public void setOnInputHandler(String oninput) {
		set(EVENT_ON_INPUT , oninput);
	}
	
	public String getOnInputHandler() {
		return get(EVENT_ON_INPUT);
	}
	
	public void setOnInvalidHandler(String oninvalid) {
		set(EVENT_ON_INVALID , oninvalid);
	}
	
	public String getOnInvalidHandler() {
		return get(EVENT_ON_INVALID);
	}
	
	public void setOnResetHandler(String onreset) {
		set(EVENT_ON_RESET , onreset);
	}
	
	public String getOnResetHandler() {
		return get(EVENT_ON_RESET);
	}
	
	public void setOnSelectHandler(String onselect) {
		set(EVENT_ON_SELECT , onselect);
	}
	
	public String getOnSelectHandler() {
		return get(EVENT_ON_SELECT);
	}
	
	public void setOnSubmitHandler(String onsubmit) {
		set(EVENT_ON_SUBMIT , onsubmit);
	}
	
	public String getOnSubmitHandler() {
		return get(EVENT_ON_SUBMIT);
	}
	
	public void setOnKeyDownHandler(String onkeydown) {
		set(EVENT_ON_KEY_DOWN , onkeydown);
	}
	
	public String getOnKeyDownHandler() {
		return get(EVENT_ON_KEY_DOWN);
	}
	
	public void setOnKeyPressHandler(String onkeypress) {
		set(EVENT_ON_KEY_PRESS , onkeypress);
	}
	
	public String getOnKeyPressHandler() {
		return get(EVENT_ON_KEY_PRESS);
	}
	
	public void setOnKeyUpHandler(String onkeyup) {
		set(EVENT_ON_KEY_UP , onkeyup);
	}
	
	public String getOnKeyUpHandler() {
		return get(EVENT_ON_KEY_UP);
	}
	
	public void setOnClickHandler(String onclick) {
		set(EVENT_ON_CLICK , onclick);
	}
	
	public String getOnClickHandler() {
		return get(EVENT_ON_CLICK);
	}
	
	public void setOnDblClickHandler(String ondblclick) {
		set(EVENT_ON_DBL_CLICK , ondblclick);
	}
	
	public String getOnDblClickHandler() {
		return get(EVENT_ON_DBL_CLICK);
	}
	
	public void setOnDragHandler(String ondrag) {
		set(EVENT_ON_DRAG , ondrag);
	}
	
	public String getOnDragHandler() {
		return get(EVENT_ON_DRAG);
	}
	
	public void setOnDragEndHandler(String ondragend) {
		set(EVENT_ON_DRAG_END , ondragend);
	}
	
	public String getOnDragEndHandler() {
		return get(EVENT_ON_DRAG_END);
	}
	
	public void setOnDragEnterHandler(String ondragenter) {
		set(EVENT_ON_DRAG_ENTER , ondragenter);
	}
	
	public String getOnDragEnterHandler() {
		return get(EVENT_ON_DRAG_ENTER);
	}
	
	public void setOnDragLeaveHandler(String ondragleave) {
		set(EVENT_ON_DRAG_LEAVE , ondragleave);
	}
	
	public String getOnDragLeaveHandler() {
		return get(EVENT_ON_DRAG_LEAVE);
	}
	
	public void setOnDragOverHandler(String ondragover) {
		set(EVENT_ON_DRAG_OVER , ondragover);
	}
	
	public String getOnDragOverHandler() {
		return get(EVENT_ON_DRAG_OVER);
	}
	
	public void setOnDragStartHandler(String ondragstart) {
		set(EVENT_ON_DRAG_START , ondragstart);
	}
	
	public String getOnDragStartHandler() {
		return get(EVENT_ON_DRAG_START);
	}
	
	public void setOnDropHandler(String ondrop) {
		set(EVENT_ON_DROP , ondrop);
	}
	
	public String getOnDropHandler() {
		return get(EVENT_ON_DROP);
	}
	
	public void setOnMouseDownHandler(String onmousedown) {
		set(EVENT_ON_MOUSE_DOWN , onmousedown);
	}
	
	public String getOnMouseDownHandler() {
		return get(EVENT_ON_MOUSE_DOWN);
	}
	
	public void setOnMouseMoveHandler(String onmousemove) {
		set(EVENT_ON_MOUSE_MOVE , onmousemove);
	}
	
	public String getOnMouseMoveHandler() {
		return get(EVENT_ON_MOUSE_MOVE);
	}
	
	public void setOnMouseOutHandler(String onmouseout) {
		set(EVENT_ON_MOUSE_OUT , onmouseout);
	}
	
	public String getOnMouseOutHandler() {
		return get(EVENT_ON_MOUSE_OUT);
	}
	
	public void setOnMouseOverHandler(String onmouseover) {
		set(EVENT_ON_MOUSE_OVER , onmouseover);
	}
	
	public String getOnMouseOverHandler() {
		return get(EVENT_ON_MOUSE_OVER);
	}
	
	public void setOnMouseUpHandler(String onmouseup) {
		set(EVENT_ON_MOUSE_UP , onmouseup);
	}
	
	public String getOnMouseUpHandler() {
		return get(EVENT_ON_MOUSE_UP);
	}
	
	public void setOnMouseWheelHandler(String onmousewheel) {
		set(EVENT_ON_MOUSE_WHEEL , onmousewheel);
	}
	
	public String getOnMouseWheelHandler() {
		return get(EVENT_ON_MOUSE_WHEEL);
	}
	
	public void setOnScrollHandler(String onscroll) {
		set(EVENT_ON_SCROLL , onscroll);
	}
	
	public String getOnScrollHandler() {
		return get(EVENT_ON_SCROLL);
	}
	
}
