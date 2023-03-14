package assignment_7.interfaceInheritance;

public class Implementation extends ConcreteClass implements CombinedInterface {

    @Override
    public void method7() {
        System.out.println("This is method7 from combinedInterface");
    }

    @Override
    public void method1() {
        System.out.println("This is method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("This is method2 from Interface1");
    }

    @Override
    public void method3() {
        System.out.println("This is method3 from Interface2");
    }

    @Override
    public void method4() {
        System.out.println("This is method4 from Interface2");
    }

    @Override
    public void method5() {
        System.out.println("This is method5 from Interface3");
    }

    @Override
    public void method6() {
        System.out.println("This is method6 from Interface3");
    }
}
