package groupBaseX;

import groupBaseX.basex.io.JsonHelper;
import groupBaseX.basex.read.Parser;
import groupBaseX.io.Person;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    
    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();
    
    private void run() throws BaseXException, IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/properties.xml"));
        Parser reader = new Parser(properties);
        List<Person> people = reader.iterate();
        log.fine(people.toString());
        JSONObject jsonPerson = null;
        JSONArray jsonPeople = new JSONArray();
        for (Person person : people) {
            jsonPerson = new JsonHelper(person).convert();
            log.info("\n\n\n\n" + jsonPerson.toString());
        }
    }
    
    public static void main(String[] args) throws IOException {
        new App().run();
    }
}
