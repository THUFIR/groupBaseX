package groupBaseX.io;

import com.opencsv.bean.CsvBindByName;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());

    @CsvBindByName(column = "0name")
    private String name = "";

    @CsvBindByName(column = "home phone 1")
    private String homePhone01 = "";

    @CsvBindByName(column = "home phone 2")
    private String homePhone2 = "";

    @CsvBindByName(column = "cell phone 1")
    private String cellPhone1 = "";

    @CsvBindByName(column = "cell phone 2")
    private String cellPhone2 = "";

    @CsvBindByName(column = "address 1")
    private String address1 = "";
   
    @CsvBindByName(column = "address 2")
    private String address2 = "";
   
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
        return homePhone01;
    }

    public void setA(String a) {
        this.homePhone01 = a;
    }

    public String getB() {
        return homePhone2;
    }

    public void setB(String b) {
        this.homePhone2 = b;
    }

    public String getC() {
        return cellPhone1;
    }

    public void setC(String c) {
        this.cellPhone1 = c;
    }

    public String getD() {
        return cellPhone2;
    }

    public void setD(String d) {
        this.cellPhone2 = d;
    }

    public String getE() {
        return address1;
    }

    public void setE(String e) {
        this.address1 = e;
    }

    public String getF() {
        return address2;
    }

    public void setF(String f) {
        this.address2 = f;
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
