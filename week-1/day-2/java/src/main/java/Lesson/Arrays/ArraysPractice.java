package Lesson.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // this is how you would declare and initialize an array
        // arrays are fixed after they're initialized
        String[] fruit = {"oranges", "apples", "pears"};
        // while arrays lack helper methods, we use the Lesson.Arrays class to utilize certain methods
        System.out.println(Arrays.toString(fruit));
        // arrays can be indexed using the square brackets
        System.out.println(fruit[1]);
        fruit[1] = "mangoes";
        System.out.println(fruit[1]);
        // we can check the size of an array using .length
        // this will give us back the number of elements in our array
        System.out.println(fruit.length);

        // below is an arraylist
        // arraylists differ from arrays in that they are dynamic
        // arrays are fixed in size by default and other collections are typically utilized
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("This is my String");
        stringArrayList.add("This is another string");

        System.out.println(stringArrayList);

        stringArrayList.set(0, "This is a changed value");

        System.out.println(stringArrayList);

        // there are a whole bunch of methods that you can call
        // these are referred to as "helper methods"
        // below is the method "clear()" which will empty the list
        stringArrayList.clear();
        System.out.println(stringArrayList);

        // you can iterate through an arrayList
        // to do this you can just use an enhanced for loop


        stringArrayList.add("One");
        stringArrayList.add("Two");
        stringArrayList.add("Three");

        // below is an enhanced for-loop
        // this loop just needs a variable to represent
        // any given value inside of a collection
        for (String string : stringArrayList ) {
            System.out.println(string);
        }

        // this is a traditional for loop
        // its technically more efficient but a lot more verbose
        for (int i = 0; i < stringArrayList.size(); i++ ){
            System.out.println(stringArrayList.get(i));
        }





        
    }

}
