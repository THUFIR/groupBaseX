package groupBaseX.csv;

import groupBaseX.App;
import groupBaseX.io.Person;
import java.util.logging.Logger;

public class Transform {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Person person = null;

    private Transform() {
    }

    public Transform(Person person) {
        this.person = person;
    }

    public void foo() {
    }

}
