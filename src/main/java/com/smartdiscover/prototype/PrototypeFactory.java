package com.smartdiscover.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class PersonType {
        public static final String USER = "user";
        public static final String EMPLOYEE = "employee";
    }

    private static Map<String, Person> prototypes = new HashMap<String, Person>();

    static {

        User user = new User();

        Employee employee = new Employee();

        prototypes.put(PersonType.USER, user);
        prototypes.put(PersonType.EMPLOYEE, employee);
    }

    public static Person getInstance(final String s) throws CloneNotSupportedException {
        return ((Person) prototypes.get(s)).clone();
    }

}
