package assignment_1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSearcher {

        public static void search(String regex){
            Scanner scanner=new Scanner(System.in);
            Pattern pattern = Pattern.compile(regex);

            File homeDir = new File(System.getProperty("user.home"));

            while (true) {
                System.out.println("Enter file name or 'quit' to exit");
                String fileName = scanner.nextLine();

                if (fileName.equalsIgnoreCase("quit")) {
                    break;
                }

                File[] matchingFiles = homeDir.listFiles((dir, name) -> {
                    Matcher matcher = pattern.matcher(name);
                    return matcher.matches() && name.contains(fileName);
                });

                if (matchingFiles.length == 0) {
                    System.out.println("No files found");
                } else {
                    System.out.println("Found " + matchingFiles.length + " files:");

                    for (File file : matchingFiles) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }

            scanner.close();
        }
}