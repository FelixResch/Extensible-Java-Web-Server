package at.resch.web.server.pages;

import at.resch.web.html.elements.BODY;
import at.resch.web.html.elements.BR;
import at.resch.web.html.elements.P;
import at.resch.web.html.elements.STRONG;

/**
 * Created by felix on 8/11/14.
 */
public class Error403 extends Error {

    private String file;

    public Error403(String file) {
        super("Access Denied", 403);
        this.file = file;
    }

    @Override
    protected BODY render() {
        BODY b = super.render();
        b.addObject(new P("You are not allowed to view the requested resource!", new BR(), new STRONG(file), new BR(), "Please contact the webmaster if you think this is a mistake"));
        return b;
    }

}
