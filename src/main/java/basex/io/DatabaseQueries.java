package basex.io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.Add;
import org.basex.core.cmd.List;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.Set;
import org.basex.core.cmd.XQuery;
import org.json.JSONArray;
import org.json.JSONObject;

public class DatabaseQueries {

    private static final Logger log = Logger.getLogger(DatabaseQueries.class.getName());
    private Properties properties = new Properties();
    private String databaseName = null;
    private Context context = null;

    private DatabaseQueries() {
    }

    public DatabaseQueries(Properties properties) {
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
        String xml = new XQuery(".").execute(context).toString();
        log.info(xml);
    }

    public JSONArray addPeople(java.util.List<Person> people) throws MalformedURLException, BaseXException {
        init();
        JsonHelper jsonHelper = new JsonHelper();
        JSONObject jsonObject = null;
        JSONArray jsonArray = new JSONArray();
        for (Person p : people) {
            jsonObject = jsonHelper.convert(p);
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }

    public void persist(JSONArray jsonPeople) throws MalformedURLException, BaseXException {
        new Set("parser", "json").execute(context);
        new Open(databaseName).execute(context);

        JSONObject jsonPerson = null;
        for (int i = 0; i < jsonPeople.length(); i++) {
            jsonPerson = new JSONObject(jsonPeople.getJSONObject(i).toString());
            log.info(jsonPerson.toString());
            new Add(jsonPerson.toString()).execute(context);
        }
    }

    public void iterate() throws BaseXException {
        init();
        new Open(databaseName).execute(context);
        String result = new XQuery(".").execute(context); //root
        log.info(result);

        JSONArray people = new JSONArray(result);
        //    JSONObject person = null;
        //   for (int i = 0; i < people.length(); i++) {
        //        person = people.getJSONObject(i);

        //     }
    }

}
