package assignment_8;

public class ExceptionThrower {
public static void throwExceptions(String name,int number1,int number2) throws NumberEqualToZero,OddNumberException,StringLengthLessThanFive{
    if(number1==0){
        throw new NumberEqualToZero("Number is equal to zero");
    }
    if(name.length()<5){
        throw new StringLengthLessThanFive("length of string less than 5");
    }
    if(number2%2==1){
        throw new OddNumberException("Number is odd number");
    }
}
}
