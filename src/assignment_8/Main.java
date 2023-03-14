//
//Error Handling
//
//  Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
//  call the method but only use a single catch clause that will catch all three types of exceptions.
//  Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

package assignment_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringLengthLessThanFive, OddNumberException, NumberEqualToZero {
        Scanner keyboard=new Scanner(System.in);
        String name=keyboard.nextLine();
        int number1=keyboard.nextInt();
        int number2=keyboard.nextInt();
        ExceptionDemo d=new ExceptionDemo();
        d.checkExceptions(name,number1,number2);
    }
}
