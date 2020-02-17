package groupBaseX.basex.json;

import groupBaseX.io.Person;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class DatabaseHelper {

    private static final Logger log = Logger.getLogger(DatabaseHelper.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;
    private String parserType = null;

    private DatabaseHelper() {
    }

    public DatabaseHelper(Properties properties) {
        this.properties = properties;
    }

    private void init() throws BaseXException {
        log.fine(properties.toString());
        parserType = properties.getProperty("parserType");
        databaseName = properties.getProperty("databaseName");
        context = new Context();
        list();
    }

    private void list() throws BaseXException {
        log.fine(new List().execute(context));
    }

    public void addPeople(java.util.List<Person> people) throws MalformedURLException, BaseXException {
        init();
        JsonHelper jsonHelper = null;// = new JsonHelper();
        JSONObject jsonObject = null;
        for (Person person : people) {
            jsonObject = new JsonHelper(person).convert();
        }
    }

}
