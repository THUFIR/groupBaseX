package groupBaseX.io;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PersonBeanBuilder {

    private static final Logger log = Logger.getLogger(PersonBeanBuilder.class.getName());
    private Person person = null;
    private PersonBean personBean = new PersonBean();

    private PersonBeanBuilder() {
    }

    public PersonBeanBuilder(Person person) {
        this.person = person;
        personBean.setName(person.getName());

        Map<String, AF> map = new HashMap<String, AF>();

        for (String s : person.getAttributes()) {
            map.put(s, AF.HOME_PHONE);
        }

        for (String key : map.keySet()) {
            switch (map.get(key)) {
                case HOME_PHONE:
                    log.info(AF.HOME_PHONE.toString());
                    break;
                default:
                    log.info(AF.HOME_PHONE.toString());
                    break;
            }

        }

    }

    public PersonBean getPersonBean() {
        return personBean;
    }

}
