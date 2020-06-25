package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        int[] ints = {1,2,3,4,7,45,21,423,9};
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(43);
        integerList.add(21);
        integerList.add(84);
        integerList.add(92);

        Arrays.sort(ints);
        Collections.sort(integerList);

         System.out.println(Arrays.toString(ints));
         System.out.println(integerList);
    }
}
