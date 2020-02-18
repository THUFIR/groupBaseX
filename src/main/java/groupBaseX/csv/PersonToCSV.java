package groupBaseX.csv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import groupBaseX.App;
import groupBaseX.io.Person;
import groupBaseX.io.PersonBean;
import groupBaseX.io.PersonBeanBuilder;
import java.io.Writer;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PersonToCSV {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private List<Person> people = new ArrayList<>();

    private PersonToCSV() {
    }

    public PersonToCSV(List<Person> people) {
        this.people = people;
    }

    public void write() throws Exception {
        List<String> records = new ArrayList<>();
        PersonBean pb = null;
        for (Person p : people) {
            pb = new PersonBeanBuilder(p).getPersonBean();
            records.add(pb.toString());
        }

        Writer writer = new FileWriter("/home/thufir/Desktop/out.csv");
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();

        StatefulBeanToCsvBuilder<String> builder = new StatefulBeanToCsvBuilder<>(writer);
        StatefulBeanToCsv<String> beanWriter = builder.build();

        writer.close();
    }
}
