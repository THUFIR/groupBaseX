package groupBaseX.io;

import com.opencsv.bean.CsvBindByName;
import java.util.logging.Logger;

public class PersonBean {

    private static final Logger log = Logger.getLogger(PersonBean.class.getName());

    @CsvBindByName(column = "0name")
    private String name = "";

    @CsvBindByName(column = "home phone 1")
    private String homePhone1 = "";

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomePhone01() {
        return homePhone1;
    }

    public void setHomePhone1(String homePhone1) {
        this.homePhone1 = homePhone1;
    }

    public String getHomePhone2() {
        return homePhone2;
    }

    public void setHomePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
    }

    public String getCellPhone1() {
        return cellPhone1;
    }

    public void setCellPhone1(String cellPhone1) {
        this.cellPhone1 = cellPhone1;
    }

    public String getCellPhone2() {
        return cellPhone2;
    }

    public void setCellPhone2(String cellPhone2) {
        this.cellPhone2 = cellPhone2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
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
