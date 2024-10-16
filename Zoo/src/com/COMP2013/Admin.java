package com.COMP2013;

public class Admin extends Employee {
    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.08);
    }
}
