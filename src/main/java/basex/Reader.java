package basex;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.List;
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
    }

    private void init() throws BaseXException {
        log.fine(properties.toString());
        databaseName = properties.getProperty("databaseName");
        context = new Context();
        list();
    }

    private void list() throws BaseXException {
        log.fine(new List().execute(context));
    }

    private void query() throws BaseXException, IOException {
        new Open(databaseName).execute(context);
        String xml = new XQuery("/text/line").execute(context).toString();
        log.info(xml);
    }

    public void iterate() throws BaseXException   {
        init();
        log.info("hello world...");

    }

}
