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

    }

    public PersonBean getPersonBean() {
        personBean.setName(person.getName());

        Map<String, AF> map = new HashMap<>();

        AF attributeField = AF.GARBAGE;
        person.getAttributes().forEach((s) -> {
            map.put(s, attributeField.getType(s));
        });

        for (String key : map.keySet()) {
            switch (map.get(key)) {
                case HOME_PHONE:
                    log.fine(AF.HOME_PHONE.toString());
                    personBean.setHomePhone1(key);
                    break;
                default:
                    log.fine(AF.HOME_PHONE.toString());
                    break;
            }
        }
        return personBean;
    }

}
