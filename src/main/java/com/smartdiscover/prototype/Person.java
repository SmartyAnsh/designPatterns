package com.smartdiscover.prototype;

abstract class Person implements Cloneable {

    private String firstName;
    private String lastName;

    private String type;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        System.out.println("Cloning Person object..");
        return (Person) super.clone();
    }
}
