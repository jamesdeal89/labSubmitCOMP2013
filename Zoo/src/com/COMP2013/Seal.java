package com.COMP2013;

public class Seal extends Animal {

    public Seal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Seal eats sardines");
    }

    @Override
    public void maintain() {
        System.out.println("Seal has a spa day");
    }
}
