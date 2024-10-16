package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();
        Zoo zoo3 = new Zoo();
        Zoo zoo4 = new Zoo();
        Zoo zoo5 = new Zoo("Nottingham", 12);
        System.out.println("Total number of zoos: " + Zoo.numZoos);
        System.out.println(zoo1.printInfo());
        System.out.println(zoo2.printInfo());
        System.out.println(zoo3.printInfo());
        System.out.println(zoo4.printInfo());
        System.out.println(zoo5.printInfo());
        ZooCorp conglomerateZoo = new ZooCorp(zoo1);
        conglomerateZoo.addZoo(zoo2);
        zoo5.buildNewCompound();
        System.out.println(zoo5.printInfo());
        Employee jamie = new Zookeeper(1, "Jamie");
        Employee michelle = new Admin(2,"Michelle");
        jamie.setSalary(10000);
        michelle.setSalary(50000);
        conglomerateZoo.addEmployee(jamie);
        conglomerateZoo.addEmployee(michelle);
        System.out.println(jamie.getClass().getSimpleName()+":"+jamie.getEmployeeName()+":"+jamie.calculateChristmasBonus());
        System.out.println(michelle.getClass().getSimpleName()+":"+michelle.getEmployeeName()+":"+michelle.calculateChristmasBonus());
    }
}
