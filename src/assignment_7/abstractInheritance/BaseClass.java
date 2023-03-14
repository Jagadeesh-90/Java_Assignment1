package assignment_7.abstractInheritance;

abstract class BaseClass {
    public BaseClass(){
System.out.println("Base class has been created");
    }
    public abstract void eat();
    public abstract void run();
    public void sleep(){
        System.out.println("Rodent is sleeping");
    }
}
