package basex;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.basex.core.Context;

public class Parser {

    private static final Logger log = Logger.getLogger(Parser.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;

    private Parser() {
    }

    public Parser(Properties properties) {
        this.properties = properties;
        databaseName = properties.getProperty("databaseName");
        context = new Context();
    }

    public void parse(List<String> lines) {
        boolean isDigit = false;
        for (String s : lines) {
            isDigit = Pattern.matches("\\D+", s);
            log.info(s + "\t\t" + Boolean.toString(isDigit));
        }
    }

}
