package assignment_7.interfaceInheritance;

public class CallingMethods {
    public void methodA(Interface1 interfaceA){
        interfaceA.method1();
        interfaceA.method2();

    }
    public void methodB(Interface2 interfaceB){
        interfaceB.method3();
        interfaceB.method4();
    }
    public void methodC(Interface3 interfaceC){
        interfaceC.method5();
        interfaceC.method6();
    }
    public void methodD(CombinedInterface interfaceD){

        interfaceD.method7();
    }
}
