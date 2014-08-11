package at.resch.web.server;

import org.apache.http.*;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.nio.*;
import org.apache.http.impl.nio.reactor.DefaultListeningIOReactor;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.http.nio.NHttpConnectionFactory;
import org.apache.http.nio.NHttpServerConnection;
import org.apache.http.nio.entity.NFileEntity;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.nio.protocol.*;
import org.apache.http.nio.reactor.IOEventDispatch;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.nio.reactor.ListeningIOReactor;
import org.apache.http.protocol.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLDecoder;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by felix on 8/11/14.
 */
public class Server implements HttpAsyncRequestHandler<HttpRequest> {

    private File docRoot;

    private boolean index_dirs;

    public static Logger log = LogManager.getLogger(Server.class);

    public void start(String[] args) {
        log.info("Server takes over!");
        log.info("Loading server.properties");
        Properties serverProperties = new Properties();
        try {
            serverProperties.loadFromXML(new FileInputStream("server.xml"));
        } catch (IOException e) {
            log.warn("Couldn't load file! Assuming defaults.");
            serverProperties.setProperty("server.docroot", "htdocs");
            serverProperties.setProperty("server.port", "8080");
            serverProperties.setProperty("server.ssh", "false");
            serverProperties.setProperty("server.list_dirs", "false");
            try {
                serverProperties.storeToXML(new FileOutputStream("server.xml"), "Server Settings");
            } catch (IOException e1) {
                log.fatal("Couldn't store Server Properties. Make sure the Server has read and write permission in this directory", e1);
            }
        }
        docRoot = new File(serverProperties.getProperty("server.docroot"));
        index_dirs = serverProperties.getProperty("server.list_dirs").equals("true");
        if(!docRoot.exists()) {
            docRoot.mkdirs();
        }
        int port = Integer.parseInt(serverProperties.getProperty("server.port"));

        HttpProcessor httpproc = HttpProcessorBuilder.create()
                .add(new ResponseDate())
                .add(new ResponseServer("XJS/1.1"))
                .add(new ResponseContent())
                .add(new ResponseConnControl()).build();

        UriHttpAsyncRequestHandlerMapper registry = new UriHttpAsyncRequestHandlerMapper();

        registry.register("*", this);

        HttpAsyncService protocolHandler = new HttpAsyncService(httpproc, registry) {
            @Override
            public void connected(NHttpServerConnection conn) {
                log.debug("Connection opened for " + conn);
                super.connected(conn);
            }

            @Override
            public void closed(NHttpServerConnection conn) {
                log.debug("Connection closed for " + conn);
                super.closed(conn);
            }
        };

        NHttpConnectionFactory<DefaultNHttpServerConnection> connFactory = null;
        if(serverProperties.getProperty("server.ssh").equals("true")) {
            log.info("Attempting to start https handler");
            ClassLoader cl = Server.class.getClassLoader();
            URL url = cl.getResource("my.keystore");
            if(url == null) {
                log.warn("No keystore found! Initializing normal http handler");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("jks");
                keyStore.load(url.openStream(), "secret".toCharArray());
                KeyManagerFactory kmfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                kmfactory.init(keyStore, "secret".toCharArray());
                KeyManager[] keyManagers = kmfactory.getKeyManagers();
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(keyManagers, null, null);
                connFactory = new SSLNHttpServerConnectionFactory(sslContext, null, ConnectionConfig.DEFAULT);
            } catch (KeyStoreException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            } catch (CertificateException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            } catch (NoSuchAlgorithmException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            } catch (IOException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            } catch (UnrecoverableKeyException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            } catch (KeyManagementException e1) {
                log.warn("Error while opening keystore! Initializing normal http handler", e1);
            }
        }
        if(connFactory == null) {
            connFactory = new DefaultNHttpServerConnectionFactory(ConnectionConfig.DEFAULT);
        }
        IOEventDispatch ioEventDispatch = new DefaultHttpServerIODispatch(protocolHandler, connFactory);

        IOReactorConfig config = IOReactorConfig.custom()
                .setIoThreadCount(0)
                .setSoTimeout(3000)
                .setConnectTimeout(3000)
                .build();

        try {
            ListeningIOReactor ioReactor = new DefaultListeningIOReactor(config);
            ioReactor.listen(new InetSocketAddress(port));
            ioReactor.execute(ioEventDispatch);
        } catch (IOReactorException e1) {
            log.fatal("Couldn't create the listening reactor", e1);
        } catch (IOException e1) {
            log.fatal("Error in basic server functionality", e1);
        }
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
        File file = new File(docRoot, URLDecoder.decode(target, "UTF-8"));
        if(!file.exists()) {
            response.setStatusCode(HttpStatus.SC_NOT_FOUND);
            NStringEntity entity = new NStringEntity("<html><head><title>Not Found</title></head><body><h1>File " + target + " not found!</h1></body><html>", ContentType.TEXT_PLAIN);
            response.setEntity(entity);
        } else if(!file.canRead()) {
            response.setStatusCode(HttpStatus.SC_FORBIDDEN);
            NStringEntity entity = new NStringEntity("<html><head><title>Not Found</title></head><body><h1>Access denied!</h1></body><html>", ContentType.TEXT_PLAIN);
            response.setEntity(entity);
        } else if(file.isDirectory()) {
            if(new File(file, "index.html").exists()) {
                response.setStatusCode(HttpStatus.SC_MOVED_PERMANENTLY);
                response.addHeader("Location", target + "/index.html");
            } else if (index_dirs) {
                response.setStatusCode(HttpStatus.SC_OK);
                String html = "<html><head><title>" + target + "</title></head><body>";
                File[] dir = file.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return !file.getName().startsWith(".");
                    }
                });
                for (File f : dir) {
                    html += "<a href=\"" + f.getName() + "\">" + f.getName() + "</a><br />";
                }
                NStringEntity entity = new NStringEntity(html, ContentType.TEXT_PLAIN);
                response.setEntity(entity);
            }
        } else {
            response.setStatusCode(HttpStatus.SC_OK);
            NFileEntity entity = new NFileEntity(file, ContentType.create("text/html", "UTF-8"));
            response.setEntity(entity);
        }
    }
}
