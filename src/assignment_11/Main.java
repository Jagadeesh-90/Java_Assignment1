//I/O
//
//  Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and
//  counts the occurrence of all the different characters. Save the results in a text file.

package assignment_11;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = keyboard.nextLine();
        CharacterCount object = new CharacterCount();
        object.characterCount(fileName);
    }
}
