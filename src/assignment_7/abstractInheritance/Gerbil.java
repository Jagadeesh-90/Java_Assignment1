package assignment_7.abstractInheritance;

import assignment_7.abstractInheritance.BaseClass;

class Gerbil extends BaseClass {
    public Gerbil() {
        System.out.println("Gerbil is created.");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is running");
    }

}