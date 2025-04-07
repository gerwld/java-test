package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String s = File.separator;
//        File file = new File(s + "Users" + s + "apple" +  s + "Desktop" + s + "test.txt");
        File file2 = new File("./src/Lesson36/test.txt");

        Scanner scanner = new Scanner(file2);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
