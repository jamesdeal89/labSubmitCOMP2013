package com.COMP2013;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eats a steak");
    }

    @Override
    public void maintain() {
        System.out.println("Lions fur is shampooed");
    }
}
