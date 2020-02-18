package groupBaseX.io;

import java.util.logging.Logger;

public class PersonBeanBuilder {

    private static final Logger log = Logger.getLogger(PersonBeanBuilder.class.getName());
    private Person person = null;
    private PersonBean personBean = null;

    private PersonBeanBuilder() {
    }

    public PersonBeanBuilder(Person person) {
        this.person = person;
        personBean.setName(person.getName());
    }

    public PersonBean getPersonBean() {
        return personBean;
    }

}
