package at.resch.web.plugins.standard;

import at.resch.web.extensions.ExtensionsManager;
import at.resch.web.extensions.annotations.CustomHandler;
import at.resch.web.extensions.annotations.Extension;
import org.apache.http.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BufferedHeader;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.nio.protocol.*;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.lesscss.LessCompiler;
import org.lesscss.LessException;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by felix on 8/12/14.
 */
@Extension(name = "Less to CSS compiler", version = "0.1")
@CustomHandler(value = "*.less")
public class LessHandler implements HttpAsyncRequestHandler<HttpRequest> {

    private HashMap<String, Long> times;
    private HashMap<String, String> cache;
    private LessCompiler lessCompiler;

    public LessHandler () {
        times = new HashMap<String, Long>();
        cache = new HashMap<String, String>();
        lessCompiler = new LessCompiler();
    }

    @Override
    public HttpAsyncRequestConsumer<HttpRequest> processRequest(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        return new BasicAsyncRequestConsumer();
    }

    @Override
    public void handle(HttpRequest httpRequest, HttpAsyncExchange httpAsyncExchange, HttpContext httpContext) throws HttpException, IOException {
        HttpCoreContext coreContext = HttpCoreContext.adapt(httpContext);
        HttpResponse response = httpAsyncExchange.getResponse();

        String method = httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ENGLISH);
        if(!method.equals("GET") && !method.equals("HEAD") && !method.equals("POST")) {
            throw new MethodNotSupportedException(method + " method not supported");
        }

        String target = httpRequest.getRequestLine().getUri();
        File file = new File(ExtensionsManager.getDocRoot(), target);
        if(!file.exists()) {
            response.setStatusCode(HttpStatus.SC_NOT_FOUND);
        } else if (!file.canRead() || !file.canExecute()) {
            response.setStatusCode(HttpStatus.SC_FORBIDDEN);
        } else {
            if(!times.containsKey(target)) {
                times.put(target, file.lastModified());
                String css = compileFile(file);
                if(css.equals("")) {
                    response.setStatusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
                } else {
                    cache.put(target, css);
                    response.setEntity(new NStringEntity(css, ContentType.create("text/css")));
                    response.setStatusCode(HttpStatus.SC_OK);
                }
            } else {
                if(times.get(target) != file.lastModified()) {
                    times.put(target, file.lastModified());
                    String css = compileFile(file);
                    if(css.equals("")) {
                        response.setStatusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
                    } else {
                        cache.put(target, css);
                        response.setEntity(new NStringEntity(css, ContentType.create("text/css")));
                        response.setStatusCode(HttpStatus.SC_OK);
                    }
                } else {
                    response.setEntity(new NStringEntity(cache.get(target), ContentType.create("text/css")));
                    response.setStatusCode(HttpStatus.SC_OK);
                }
            }
        }
        httpAsyncExchange.submitResponse(new BasicAsyncResponseProducer(response));
    }

    private String compileFile(File file) {
        try {
            BufferedReader din = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            String content = "";
            while((line = din.readLine()) != null) {
                content += line + "\n";
            }
            return lessCompiler.compile(content);
        } catch (FileNotFoundException e) {
            ExtensionsManager.logger.warn("Couldn't read file to compile", e);
        } catch (IOException e) {
            ExtensionsManager.logger.warn("Couldn't read file to compile", e);
        } catch (LessException e) {
            ExtensionsManager.logger.warn("Less compile error" , e);
        }
        return "";
    }
}
