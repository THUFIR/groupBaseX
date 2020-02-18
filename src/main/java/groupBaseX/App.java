package groupBaseX;

import groupBaseX.basex.read.Parser;
import groupBaseX.csv.PersonToCSV;
import groupBaseX.io.Person;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void run() throws BaseXException, IOException, Exception {
        properties.loadFromXML(App.class.getResourceAsStream("/readPeopleText.xml"));
        Parser reader = new Parser(properties);
        List<Person> people = reader.iterate();
        log.fine(people.toString());

     //   properties.loadFromXML(App.class.getResourceAsStream("/writePeopleJson.xml"));
     //   JsonDatabaseHelper jsonDatabaseHelper = new JsonDatabaseHelper(properties);
     //   jsonDatabaseHelper.addPeople(people);
        
        PersonToCSV c = new PersonToCSV();
        c.write(people);
    }

    public static void main(String[] args) throws IOException, Exception {
        new App().run();
    }
}
