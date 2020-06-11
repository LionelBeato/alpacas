package Lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOLesson {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);

        File file = new File("src/main/resources/bio.txt");
        Scanner filescanner = new Scanner(file);
        System.out.println(file.getName());

        while(filescanner.hasNextLine()){
            String i = filescanner.nextLine();
            System.out.print(i);
        }
    }
}
