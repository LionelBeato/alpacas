package Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLesson {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("One","Two","Three","Four");

        System.out.println(stringList);

        // below is a stream
        // this stream allows us to perform operations on a collection in a very concise fashion
        // here we're skipping the first element in our stream and printing out each element afterwards
        stringList.stream()
                .skip(1)
                .forEach(System.out::println);


        // you can assign a stream to a variable reference if that works for you
        Stream<String> stringStream = stringList.stream();

        System.out.println("The following will print the amount of elements in my stream: " + stringStream.count());

        // streams allow us to utilize whats known as higher order functions
        // these functions will accept functions as arguments for their parameters
        // this can be further simplified by utilizing method references

        Stream<String> stringStream1 = stringList.stream();
        stringStream1.forEach(el -> System.out.println(el));

        // here's a more practical use of streams

        Customer john = new Customer("John", 15);
        Customer sally = new Customer("Sally", 200);
        Customer jim = new Customer("Jim", 150);
        Customer mark = new Customer("Mark", 1);

        List<Customer> customers = Arrays.asList(john, sally, jim, mark);

//        List<Customer> customersWithMoreThan100Points = customers.stream()
//                .filter(c -> c.getPoints() > 100)
//                .collect(Collectors.toList());

        List<Customer> customersWithMoreThan100Points = customers.stream()
                .filter(Customer::hasOverHundredPoints)
                .collect(Collectors.toList());



        System.out.println(customersWithMoreThan100Points);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        integerList.stream()
                .map(x -> x + x)
                .filter(x -> x % 5 == 0)
                .forEach(System.out::println);
    }
}
