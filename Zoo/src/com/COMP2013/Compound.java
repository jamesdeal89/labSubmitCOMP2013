package com.COMP2013;

import java.util.ArrayList;

public class Compound {
    private ArrayList<Animal> compounds;

    public Compound() {
        compounds = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        compounds.add(animal);
    }
}
