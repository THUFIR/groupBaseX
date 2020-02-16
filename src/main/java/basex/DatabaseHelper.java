package basex;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Logger;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.List;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;

public class DatabaseHelper {

    private static final Logger log = Logger.getLogger(DatabaseHelper.class.getName());
    private Properties properties = new Properties();
    private URL url = null;
    private String databaseName = null;
    private Context context = null;
    private String parserType = null;

    private DatabaseHelper() {
    }

    public DatabaseHelper(Properties properties) {
        this.properties = properties;
    }

    private void init() throws MalformedURLException, BaseXException {
        log.fine(properties.toString());
        parserType = properties.getProperty("parserType");
        url = new URL(properties.getProperty(parserType + "URL"));
        databaseName = properties.getProperty("databaseName");
        context = new Context();
        list();
    }

    private void list() throws BaseXException {
        log.fine(new List().execute(context));
    }

    private void query() throws BaseXException, IOException {
        new Open(databaseName).execute(context);
        String xml = new XQuery(".").execute(context).toString();
        log.info(xml);
        /*
        File xmlFile = new File("src/main/resources/example.xml");
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
Document element = dBuilder.parse(xmlFile);

NodeList list = element.getElementsByTagName("ID");
for (int i = 0; i < list.getLength(); i++){
    Node specificIDNode = list.item(i);
    System.out.println(specificIDNode.getTextContent());
}
         */
    }

    public void foo() throws MalformedURLException, BaseXException, IOException {
        init();
        query();
        list();
    }

    public void addPeople(java.util.List<Person> people) throws MalformedURLException, BaseXException {
        init();
    }

}
