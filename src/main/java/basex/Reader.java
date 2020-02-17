package basex;

import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;

public class Reader {

    private static final Logger log = Logger.getLogger(Reader.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;

    private Reader() {
    }

    public Reader(Properties properties) {
        this.properties = properties;
        databaseName = properties.getProperty("databaseName");
        context = new Context();
    }

    public String iterate() throws BaseXException {
        String foo = new Open(databaseName).execute(context);
        String xml = new XQuery(".").execute(context).toString();
        log.info(foo);
        return xml;
    }

}
