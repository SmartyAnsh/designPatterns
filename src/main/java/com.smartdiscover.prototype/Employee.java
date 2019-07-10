package com.smartdiscover.prototype;

public class Employee extends Person {

    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee() {
        this.setType("EMPLOYEE");
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "Person Object with type : " +str;
    }

}
