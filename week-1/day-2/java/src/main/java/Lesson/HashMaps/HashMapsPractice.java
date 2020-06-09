package Lesson.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapsPractice {

    // you'll notice that I'm creating a new main method
    // programs can have more than one main method
    // you can run whichever you want to at any given time
    public static void main(String[] args) {

        // below is the declaration of a hashmap
        // you'll notice that there's two generic typings
        // this is your key-value pair
        // you use the key to access whatever value is associated
        // ...with that key
        // keys cannot be reused but values can
        HashMap<String, Integer> personAge = new HashMap<>();

        personAge.put("Joan", 21);
        personAge.put("Anna", 34);


        // keep in mind that the reason we can use a system.out...
        //...with our variables is that the associated classes have a...
        //...toString() method
        System.out.println(personAge);

        personAge.get("Joan");

        // so hashmaps are not technically iterable but you can
        // utilize the Map.Entry interface and entrySet() method to
        // step through every value in any given hashmap
        for (Map.Entry<String, Integer> entry: personAge.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }


        HashMap<String, String> lionelData = new HashMap<>();

        lionelData.put("Name", "Lionel");
        lionelData.put("Age", "29");
        lionelData.put("Hometown", "Hartford");


        System.out.println(lionelData);

        HashMap<String, String> userData = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name:");
        String name = scanner.next();
        userData.put("Name", name);

        System.out.println("Input your age:");
        String age = scanner.next();
        userData.put("Age", age);

        System.out.println("Input your hometown:");
        String homeTown = scanner.next();
        userData.put("Hometown", homeTown);

        scanner.close();

        System.out.print(userData);








    }
}
