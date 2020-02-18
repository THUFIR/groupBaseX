package groupBaseX.io;

import java.util.logging.Logger;

public class PersonBeanBuilder {

    private static final Logger log = Logger.getLogger(PersonBeanBuilder.class.getName());
    private Person person = null;
    private PersonBean personBean = new PersonBean();

    private PersonBeanBuilder() {
    }

    public PersonBeanBuilder(Person person) {
        this.person = person;
        log.fine(person.toString());
        log.fine(person.getName());
        personBean.setName(person.getName());

        try {
            personBean.setA(person.getAttributes().get(0));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.info("meh");
        }
        try {
            personBean.setB(person.getAttributes().get(1));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.info("meh");
        }
        try {
            personBean.setC(person.getAttributes().get(2));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.info("meh");
        }
        try {
            personBean.setD(person.getAttributes().get(3));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.info("meh");
        }
        try {
            personBean.setE(person.getAttributes().get(4));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.info("meh");
        }

    }

    public PersonBean getPersonBean() {
        return personBean;
    }

}
