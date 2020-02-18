package groupBaseX.io;

import com.opencsv.bean.CsvBindByName;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());

    @CsvBindByName(column = "0name")
    private String name = "foo";

    @CsvBindByName(column = "a")
    private String a = "";

    @CsvBindByName(column = "b")
    private String b = "";

    @CsvBindByName(column = "c")
    private String c = "";

    @CsvBindByName(column = "d")
    private String d = "";

    @CsvBindByName(column = "e")
    private String e = "";
   
    @CsvBindByName(column = "f")
    private String f = "";
   
    @CsvBindByName(column = "g")
    private String g = "";
   
    @CsvBindByName(column = "h")
    private String h = "";
   
    @CsvBindByName(column = "i")
    private String i = "";
   
    @CsvBindByName(column = "j")
    private String j = "";
   
    @CsvBindByName(column = "k")
    private String k = "";
  
    @CsvBindByName(column = "l")
    private String l = "";

    public PersonBean() {
    }

    
    
    @Override
    public String toString() {
        return "\n\n\n---------------------------\n\n\n" + getName() + "\n";
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

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

}
