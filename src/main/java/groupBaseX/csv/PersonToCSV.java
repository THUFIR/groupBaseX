package groupBaseX.csv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import groupBaseX.App;
import groupBaseX.io.Person;
import java.io.Writer;
import java.io.FileWriter;
import java.util.List;
import java.util.logging.Logger;

public class PersonToCSV {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Person person = null;

    private PersonToCSV() {
    }

    public PersonToCSV(Person person) {
        this.person = person;
    }

    public StatefulBeanToCsv writeCsvFromBean(List<Person> people) throws Exception {
        Writer writer = new FileWriter("/home/thufir/Desktop/out.csv");
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();

        StatefulBeanToCsvBuilder<Person> builder = new StatefulBeanToCsvBuilder<>(writer);
        StatefulBeanToCsv<Person> beanWriter = builder.build();
        beanWriter.write(people);
        writer.close();

        return sbc;
    }
}
