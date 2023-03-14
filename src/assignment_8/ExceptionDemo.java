package assignment_8;

public class ExceptionDemo {
    public void checkExceptions(String name,int number1,int number2){
        try{
           ExceptionThrower.throwExceptions(name,number1,number2);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    finally{
            System.out.println("Final method is executed");
        }
    }
}
