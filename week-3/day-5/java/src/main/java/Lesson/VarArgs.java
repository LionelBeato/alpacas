package Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarArgs {

    // below is the use of varargs, or variable arguments
    // using the ... notation with can define an arbitrary amount of arguments for our parameters
    public static String[] doSomething(String... args){
        return args;
    }

    // args will be treated as an array
    // we dont have to return an array in our method, however
    // here we're returning a List instead of an array
    public static List<Integer> integerSomething(Integer... args){

        return Arrays.stream(args).map(x -> x + x).collect(Collectors.toList());
    }



    public static void main(String[] args) {

        String[] myArray = doSomething("Hello", "World", "and","Hello","Universe");
        System.out.println(Arrays.toString(myArray));



        // note the amount of arguments that we can provide
        List<Integer> myIntList = integerSomething(1,2,3,4,5);
        System.out.println(myIntList);

    }

}
