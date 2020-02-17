package basex.io;

import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;

public class Helper {

    private static final Logger log = Logger.getLogger(Helper.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;

    private Helper() {
    }

    public Helper(Properties properties) {
        this.properties = properties;
    }

    private void init() throws BaseXException {
        log.fine(properties.toString());
        databaseName = properties.getProperty("databaseName");
        context = new Context();
    }

}
