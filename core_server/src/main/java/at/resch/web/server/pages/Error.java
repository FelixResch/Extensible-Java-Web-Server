package at.resch.web.server.pages;

import at.resch.web.html.elements.*;


/**
 * Created by felix on 8/11/14.
 */
public abstract class Error {

    private String description;
    private int errno;

    public Error(String description, int errno) {
        this.description = description;
        this.errno = errno;
    }

    protected BODY render() {
        BODY b = new BODY(new H1(errno + " - " + description));
        return b;
    }

    public String getPage() {
        BODY b = render();
        b.addObject(new HR());
        b.addObject(new P("Extensible Java Web Server Version 0.0.2-indev"));
        HTMLDocument doc = new HTMLDocument(new HEAD(new TITLE(description)), b);
        return doc.renderHTML();
    }
}
