package com.COMP2013;

public abstract class Employee implements  Employable {
    int ID;
    String name;
    int salary;

    public Employee(int id, String name) {
        setEmployeeID(id);
        setEmployeeName(name);
    }

    @Override
    public void setEmployeeID(int number) {
        ID = number;
    }

    @Override
    public int getEmployeeID() {
        return ID;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateChristmasBonus() {
        // no bonus for standard employee
        return 0;
    }

}
