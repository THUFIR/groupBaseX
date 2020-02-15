package groupBaseX;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.List;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties props = new Properties();
    private Context context;

    private void getGreeting() throws IOException {
        props.loadFromXML(App.class.getResourceAsStream("/basex.xml"));
        log.info(props.toString());
    }

    private void list() throws BaseXException {
        log.fine(new List().execute(context));
    }

    public static void main(String[] args) throws IOException {
        new App().getGreeting();
    }
}
