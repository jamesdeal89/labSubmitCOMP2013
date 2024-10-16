package com.COMP2013;

public abstract class Animal implements Maintainable {
    public String name;

    public Animal(String name) { this.setName(name);}

    public abstract void eat();

    public void enjoy() { System.out.println(this.getClass().getSimpleName()+" enjoys life as an animal");}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
