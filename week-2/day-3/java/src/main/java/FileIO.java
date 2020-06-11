import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/test.txt");

        Scanner scanner = new Scanner(new FileReader("src/main/resources/test.txt"));
        Scanner filescanner = new Scanner(file);
        System.out.println(scanner);

        while (scanner.hasNextLine()) {
            String i = scanner.next();
            System.out.println(i);
        }

        while (filescanner.hasNext()){
            String i = filescanner.next();
            System.out.println(i);
        }

    }
}
