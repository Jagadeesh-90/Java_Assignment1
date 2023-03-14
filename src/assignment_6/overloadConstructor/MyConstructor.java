package assignment_6.overloadConstructor;

public class MyConstructor {
    private int number;
    public MyConstructor(){
        this(5);
    }
    public MyConstructor(int num){
        this.number=num;
    }
    public void printNum(){
        System.out.println(number);
    }
}
