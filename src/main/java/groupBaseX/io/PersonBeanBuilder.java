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
        personBean.setName(person.getName());

        try {
            personBean.setA(person.getAttributes().get(0));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }
        try {
            personBean.setB(person.getAttributes().get(1));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }
        try {
            personBean.setC(person.getAttributes().get(2));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }
        try {
            personBean.setD(person.getAttributes().get(3));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setE(person.getAttributes().get(4));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setF(person.getAttributes().get(5));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setG(person.getAttributes().get(6));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setH(person.getAttributes().get(7));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setI(person.getAttributes().get(8));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setJ(person.getAttributes().get(9));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setK(person.getAttributes().get(10));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

        try {
            personBean.setL(person.getAttributes().get(11));
        } catch (java.lang.IndexOutOfBoundsException e) {
            log.fine("meh");
        }

    }

    public PersonBean getPersonBean() {
        return personBean;
    }

}
