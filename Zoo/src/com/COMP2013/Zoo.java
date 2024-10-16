package com.COMP2013;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numCompounds;
    static int numZoos = 0;
    private ArrayList<Compound> compounds;
    private final int zooId;

    public Zoo() {
        this.setLocation("unknown");
        this.setNumCompounds(30);
        numZoos++;
        this.zooId = numZoos;
        compounds = new ArrayList<Compound>();
        for (int i=0;i<numCompounds;i++) {
            this.compounds.add(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
        this.numCompounds++;
    }

    public Zoo(String location, int numCompounds) {
        this.setLocation(location);
        this.setNumCompounds(numCompounds);
        numZoos++;
        this.zooId = numZoos;
        compounds = new ArrayList<Compound>();
        for (int i=0;i<numCompounds;i++) {
            addCompound(new Compound());
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumCompounds() {
        return numCompounds;
    }

    public void setNumCompounds(int numCompounds) {
        this.numCompounds = numCompounds;
    }

    public void buildNewCompound() {
        this.numCompounds++;
    }

    public String printInfo() {
        return "location is " + this.getLocation() + ", with " + this.getNumCompounds() + " compounds";
    }

    public int getZooId() {
        return zooId;
    }
}
