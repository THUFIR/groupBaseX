package groupBaseX;

import basex.DatabaseHelper;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.Context;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties props = new Properties();
    private DatabaseHelper db = null;

    private void foo() throws IOException {
        props.loadFromXML(App.class.getResourceAsStream("/basex.xml"));
        log.info(props.toString());
        db = new DatabaseHelper(props);
        db.foo();
    }

    public static void main(String[] args) throws IOException {
        new App().foo();
    }
}
