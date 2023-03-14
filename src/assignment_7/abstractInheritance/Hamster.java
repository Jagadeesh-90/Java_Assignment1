package assignment_7.abstractInheritance;

import assignment_7.abstractInheritance.BaseClass;

public class Hamster extends BaseClass {
    public Hamster(){
        System.out.println("Hamster is created");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void run() {
System.out.println("Hamster is running");
    }

}
