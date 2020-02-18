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

    public PersonToCSV() {
    }

    private List<PersonBean> beanList(List<Person> people) throws Exception {
        List<PersonBean> peopleBeans = new ArrayList<>();
        PersonBean personBean = null;
        for (Person person : people) {
            personBean = new PersonBeanBuilder(person).getPersonBean();
            peopleBeans.add(personBean);
        }
        return peopleBeans;
    }

    public void write(List<Person> people) throws Exception {
        Writer writer = new FileWriter("/home/thufir/Desktop/out.csv");
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();

        StatefulBeanToCsvBuilder<PersonBean> builder = new StatefulBeanToCsvBuilder<>(writer);
        StatefulBeanToCsv<PersonBean> beanWriter = builder.build();

        beanWriter.write(beanList(people));

        writer.close();
    }
}
