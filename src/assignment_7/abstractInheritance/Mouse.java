package assignment_7.abstractInheritance;

import assignment_7.abstractInheritance.BaseClass;

public class Mouse extends BaseClass {
    public Mouse(){
        System.out.println("Mouse is created");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void run() {
System.out.println("Mouse is running");
    }

}
