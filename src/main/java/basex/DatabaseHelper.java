package basex;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Command;
import org.basex.core.Context;
import org.basex.core.cmd.List;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.Replace;
import org.basex.core.cmd.Set;
import org.basex.core.cmd.XQuery;
import org.basex.io.in.ArrayInput;

public class DatabaseHelper {

    private static final Logger log = Logger.getLogger(DatabaseHelper.class.getName());
    private Properties properties = new Properties();
    private URL url = null;
    private String databaseName = null;
    private Context context = null;
    private String parserType = null;

    private DatabaseHelper() {
    }

    public DatabaseHelper(Properties properties) {
        this.properties = properties;
    }

    private void init() throws MalformedURLException, BaseXException {
        log.fine(properties.toString());
        parserType = properties.getProperty("parserType");
        url = new URL(properties.getProperty(parserType + "URL"));
        databaseName = properties.getProperty("databaseName");
        context = new Context();
        list();
    }

    private void list() throws BaseXException {
        log.fine(new List().execute(context));
    }

    private void replace() throws BaseXException, IOException {

        new Open(databaseName).execute(context);
        Command replace = null;

        for (int i = 1; i < 9; i++) {
            replace.execute(context);
        }
        log.fine((new XQuery(".")).execute(context).toString());
    }

    public void dropCreateAdd() throws MalformedURLException, BaseXException, IOException {
        init();
        // drop();
        //  create();
        replace();
        list();
    }

}
