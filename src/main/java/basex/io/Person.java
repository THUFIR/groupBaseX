package basex.io;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Person {

    private static final Logger log = Logger.getLogger(Person.class.getName());
    private String name = "";
    private List<String> attributes = new ArrayList<>();

    private Person() {
    }

    Person(String name, List<String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : attributes) {
            stringBuilder.append(s);
            stringBuilder.append("\t");
        }
        return "\n\n\n" + name + "\n" + stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}
