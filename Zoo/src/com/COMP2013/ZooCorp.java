package com.COMP2013;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employable> employees;

    public ZooCorp(Zoo zoo) {
        zoos = new ArrayList<Zoo>();
        zoos.add(zoo);
        employees = new ArrayList<Employable>();

    }

    public void addZoo(Zoo zoo) {
        zoos.add(zoo);
    }

    public void addEmployee(Employable employee) {
        employees.add(employee);
    }
}
