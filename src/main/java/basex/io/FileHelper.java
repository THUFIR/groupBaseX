package basex.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class FileHelper {

    private static final Logger log = Logger.getLogger(FileHelper.class.getName());
    private Properties properties = null;
    private List<String> lines = null;
    private Person person = null;
    private List<Person> people = new ArrayList<>();
    private List<String> attributes = new ArrayList<>();

    private FileHelper() {
    }

    public FileHelper(Properties properties) {
        this.properties = properties;
    }

    private void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(properties.getProperty("dataFile")));
        lines = new ArrayList();
        reader.lines().forEach(line -> lines.add(line));
        Collections.reverse(lines);
        log.fine(lines.toString());
    }

    public List<Person> getPeople() throws IOException {
        readFile();
        String regex = "\\D+";
        boolean isDigit = false;
        for (String s : lines) {
            isDigit = Pattern.matches(regex, s);
            log.fine(s + "\t\t" + Boolean.toString(isDigit));
            if (!isDigit) {
                addAttribute(s);
            } else {
                addPerson(s);
            }
        }
        log.fine(people.toString());
        return people;
    }

    private void addAttribute(String s) {
        attributes.add(s);
    }

    private void addPerson(String name) {
        person = new Person(name, attributes);
        people.add(person);
        person = null;
        attributes = new ArrayList<>();
    }

}
