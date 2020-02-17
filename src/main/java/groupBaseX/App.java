package groupBaseX;

import basex.read.Parser;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void run() throws BaseXException, IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/properties.xml"));
        Parser reader = new Parser(properties);
        String xmlResult = reader.iterate();
        log.fine(xmlResult);
    }

    public static void main(String[] args) throws IOException {
        new App().run();
    }
}
