package com.COMP2013;

public class Zookeeper extends Employee {
    public Zookeeper(int id, String name) {
        super(id,name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.05 + 100);
    }
}
