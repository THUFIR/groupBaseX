package groupBaseX;

import basex.DatabaseHelper;
import basex.FileHelper;
import basex.Person;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    private void foo() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/basex.xml"));
        log.fine(properties.toString());
        FileHelper f = new FileHelper(properties);
        List<Person> people = f.getPeople();
        log.info(people.toString());
        DatabaseHelper db = new DatabaseHelper(properties);
        db.addPeople(people);
    }

    public static void main(String[] args) throws IOException {
        new App().foo();
    }
}
