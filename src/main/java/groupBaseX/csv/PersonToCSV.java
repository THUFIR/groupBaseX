package groupBaseX.csv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import groupBaseX.App;
import groupBaseX.io.Person;
import java.io.Writer;
import java.util.logging.Logger;

public class PersonToCSV {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Person person = null;

    private PersonToCSV() {
    }

    public PersonToCSV(Person person) {
        this.person = person;
    }

    public StatefulBeanToCsv writeCsvFromBean() throws Exception {
        Writer writer = null;
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();
        return sbc;
    }
}
