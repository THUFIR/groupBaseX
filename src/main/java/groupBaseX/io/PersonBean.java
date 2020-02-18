package groupBaseX.io;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());
    private String name = "";
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private List<String> attributes = new ArrayList<>();


    private PersonBean() {
    }

    public PersonBean(String name, List<String> attributes) {
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
        return "\n\n\n---------------------------\n\n\n" + name + "\n" + stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}
