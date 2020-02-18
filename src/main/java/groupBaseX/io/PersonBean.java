package groupBaseX.io;

import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());
    private String name = "";

    public PersonBean() {
    }

    @Override
    public String toString() {
        return "\n\n\n---------------------------\n\n\n" + name + "\n";
    }

    void setName(String name) {
        this.name = name;
    }

}
