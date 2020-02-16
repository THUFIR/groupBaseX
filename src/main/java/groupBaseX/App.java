package groupBaseX;

import basex.FileHelper;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void foo() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/basex.xml"));
        log.fine(properties.toString());
        FileHelper f = new FileHelper(properties);
        f.processLines();
    }

    public static void main(String[] args) throws IOException {
        new App().foo();
    }
}
