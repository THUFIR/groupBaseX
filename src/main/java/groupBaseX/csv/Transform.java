package groupBaseX.csv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import groupBaseX.App;
import groupBaseX.io.Person;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Transform {

    private static final Logger log = Logger.getLogger(App.class.getName());
    private Person person = null;

    private Transform() {
    }

    public Transform(Person person) {
        this.person = person;
    }

    public void writeCsvFromBean(Path path) throws Exception {
        Writer writer = new FileWriter(path.toString());

        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();

        List<CsvBean> list = new ArrayList<>();
        list.add(new WriteExampleBean("Test1", "sfdsf", "fdfd"));
        list.add(new WriteExampleBean("Test2", "ipso", "facto"));

        sbc.write(list);
        writer.close();
      //  return Helpers.readFile(path);
    }
}
