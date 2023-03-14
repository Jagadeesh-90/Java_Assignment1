//
//String and Type Information
//
//        Using the documentation for java.util.regex.Pattern as a resource,
//        write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.

package assignment_9;

import java.util.Scanner;
import java.util.regex.Pattern;

import static assignment_9.MatchSentence.sentenceMethod;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String sentence=keyboard.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].*$");
        sentenceMethod(pattern,sentence);
    }

}
