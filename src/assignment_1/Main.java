//
//Create a java program to search through the home directory and look for files that match a regular expression.
// The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
//
//        Provide appropriate documentation and comments on your code.
//

package assignment_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter regular expression:");
        String regex = scanner.nextLine();
        FileSearcher searcher = new FileSearcher();
        searcher.search(regex);
    }
}
