package groupBaseX.io;

import com.opencsv.bean.CsvBindByName;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());

    @CsvBindByName(column = "name")
    private String name = "foo";
    private String a = "null";
    private String b = "null";
    private String c = "null";
    private String d = "null";
    private String e = "null";

    public PersonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "\n\n\n---------------------------\n\n\n" + getName() + "\n";
    }

}
