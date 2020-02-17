package groupBaseX.basex.read;


import groupBaseX.io.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;

public class Parser {

    private static final Logger log = Logger.getLogger(Parser.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;
    private Person person = null;
    private List<Person> people = new ArrayList<>();

    private Parser() {
    }

    public Parser(Properties properties) {
        this.properties = properties;
        databaseName = properties.getProperty("databaseName");
        context = new Context();
    }

    public List<Person> iterate() throws BaseXException {
        String open = new Open(databaseName).execute(context);
        String xml = new XQuery(".").execute(context).toString();
        int count = Integer.parseInt(new XQuery("count(/text/line)").execute(context).toString());
        log.fine(Integer.toString(count));
        boolean isDigit = false;
        List<String> attribs = new ArrayList<>();

        String s = null;
        for (int i = count; i > 0; i--) {
            s = new XQuery("/text/line[" + i + "]/text()").execute(context);
            isDigit = Pattern.matches("\\D+", s);
            if (!isDigit) {
                attribs.add(s);
            } else {
                person = new Person(s, attribs);
                attribs = new ArrayList<>();
                people.add(person);
            }
            log.fine(s + "\t\t\t" + isDigit);
        }
        return people;
    }

}
