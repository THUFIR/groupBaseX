package groupBaseX;

import basex.DatabaseHelper;
import basex.FileHelper;
import basex.Person;
import basex.Reader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.json.JSONArray;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void run() throws BaseXException, IOException   {
        properties.loadFromXML(App.class.getResourceAsStream("/real.xml"));
        basex.Reader dq = new Reader(properties);
        dq.iterate();
    }

    private void load() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/real.xml"));
        log.fine(properties.toString());
        FileHelper f = new FileHelper(properties);
        List<Person> people = f.getPeople();
        log.fine(people.toString());
        DatabaseHelper db = new DatabaseHelper(properties);
        JSONArray jsonPeople = db.addPeople(people);
        log.info(jsonPeople.toString());
        //   db.persist(jsonPeople);
    }

    public static void main(String[] args) throws IOException {
        new App().run();
    }
}
