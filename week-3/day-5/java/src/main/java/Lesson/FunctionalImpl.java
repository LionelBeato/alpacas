package Lesson;

public class FunctionalImpl {

    public static void main(String[] args) {

//        Below is the older way of implementing functional interfaces
//        we would utilize an anonymous inner class
//        the problem with this approach is that its verbose, there's a lot of typing

//        MyFunction myFunction = new MyFunction() {
//            @Override
//            public void doSomething() {
//                System.out.println("I come from a functional interface!");
//            }
//        };

        // Below is the lambda expression equivalent to our anonymous inner class from above
        // note that we use an arrow to denote parameters and a return value
//        arrow function as a concept have an input and an output
//        those inputs/outputs do not have to map to anything and they dont need to correlate
//        () -> {} this expression is completely legal in the scope of lambda calculus

        MyFunction myFunction = () -> System.out.println("I come from a functional interface!");
        MyFunction myFunction1 = () -> {};

        myFunction.doSomething();
        myFunction1.doSomething();

        // it's important to note that you can optional use the curly braces if there's one statement
        // if there's more than one, the curly braces are mandatory
        MyFunction myFunction2 = () -> {
            System.out.println("I'm in a lambda statement!");
            System.out.println("Hello there, everyone!");
        };

        myFunction2.doSomething();



        Newable newable = x -> System.out.println(x);

        newable.doSomething("Hello, I am the parameter x");


        // If you have more than one parameter, you NEED to use parenthesis for your parameters
        Otherable otherable = (x, y) -> System.out.println(x + " " + y);

        otherable.doSomething("Hello", "World");

        // below is a method reference
        // if we have one input and use it with one specific output, we can create a shorthand
        // to the method call using the double colon syntax
        Newable newable1 = System.out::println;

        newable1.doSomething("Hello");


        // This is a custom method reference that I've implemented
        // it is possible to create your own method references or utilize method references
        // with any given appropriate method
        Newable newable2 = ReferenceTest::printSomething;
        newable2.doSomething("Hello, I'm in a custom method reference!");


    }

}
