//
//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
// Write time and space complexity of your solution as comments in the source file.
//


package assignment_2;

import java.util.Scanner;

import static assignment_2.AlphabetChecker.containsAllLetters;


public class Main {
    public static void main(String[] args) {
        String input;
        Scanner keyBoard=new Scanner(System.in);
        input=keyBoard.nextLine();
        System.out.println(input + "  contains all letters  " +containsAllLetters(input));
    }

}
