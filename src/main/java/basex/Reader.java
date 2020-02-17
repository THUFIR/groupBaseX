package basex;

import java.util.Properties;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;

public class Reader {

    private static final Logger log = Logger.getLogger(Reader.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;
    private Parser p = null;

    private Reader() {
    }

    public Reader(Properties properties) {
        this.properties = properties;
        databaseName = properties.getProperty("databaseName");
        context = new Context();
        p = new Parser(properties);
    }

    public String iterate() throws BaseXException {
        String open = new Open(databaseName).execute(context);
        String xml = new XQuery(".").execute(context).toString();
        int count = Integer.parseInt(new XQuery("count(/text/line)").execute(context).toString());
        log.fine(Integer.toString(count));
        boolean isDigit = false;

        String s = null;
        for (int i = count; i > 0; i--) {
            s = new XQuery("/text/line[" + i + "]/text()").execute(context);
            isDigit = Pattern.matches("\\D+", s);
            log.info(s + "\t\t\t" + isDigit);
        }
        return xml;
    }

}
