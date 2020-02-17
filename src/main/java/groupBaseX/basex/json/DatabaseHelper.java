package groupBaseX.basex.json;

import groupBaseX.io.Person;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Command;
import org.basex.core.Context;
import org.basex.core.cmd.Add;
import org.basex.core.cmd.List;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.Set;
import org.basex.io.in.ArrayInput;
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
        log.fine(new List().execute(context));
    }

    public void loadPeople() throws BaseXException {
        init();
        log.fine(new Open(databaseName).execute(context));
        log.fine(new Set("parser", "json").execute(context));
        //
        //should return JSONArray
    }

    public void addPeople(java.util.List<Person> people) throws BaseXException {
        init();
        log.fine(new Open(databaseName).execute(context));
        log.fine(new Set("parser", "json").execute(context));
        JSONObject jsonPerson = null;
        JSONArray jsonPeople = new JSONArray();
        Command add = null;
        for (Person person : people) {
            jsonPerson = new JsonHelper(person).convert();
            jsonPeople.put(jsonPerson);
        }

        add = new Add(".json");
        add.setInput(new ArrayInput(jsonPeople.toString()));
        log.fine(add.execute(context));
    }

}
