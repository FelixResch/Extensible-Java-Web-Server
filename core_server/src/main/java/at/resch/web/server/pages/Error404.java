package at.resch.web.server.pages;

import at.resch.web.html.elements.BODY;
import at.resch.web.html.elements.BR;
import at.resch.web.html.elements.P;
import at.resch.web.html.elements.STRONG;

/**
 * Created by felix on 8/11/14.
 */
public class Error404 extends Error {

    private String file;

    public Error404(String file) {
        super("File Not Found", 404);
        this.file = file;
    }

    @Override
    protected BODY render() {
        BODY b = super.render();
        b.addObject(new P("The Server couldn't find the file you were requesting!", new BR(), new STRONG(file), new BR(), "Please contact the webmaster if you think this is a mistake"));
        return b;
    }
}
