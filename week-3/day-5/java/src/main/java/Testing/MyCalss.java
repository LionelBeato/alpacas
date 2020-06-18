package Testing;

import java.util.Arrays;
import java.util.List;

public class MyCalss {

    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public void printSomething() {
                System.out.println("Hello World!");
            }
        };

        myInterface.printSomething();
        MyInterface myInterface1 = () -> System.out.println("Hello World!");

        myInterface1.printSomething();


        List<String> stringList = Arrays.asList("Hello","World","Hey","Hi!");

        System.out.println(stringList);
        stringList.stream()
                .map(x -> x + x)
                .forEach(System.out::println);


    }
}
