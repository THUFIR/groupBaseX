package groupBaseX.io;

import com.opencsv.bean.CsvBindByName;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());
    
    @CsvBindByName(column = "name")
    private String name = "foo";

    public PersonBean() {
    }

    @Override
    public String toString() {
        return "\n\n\n---------------------------\n\n\n" + name + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

}
