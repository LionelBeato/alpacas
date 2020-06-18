package Lesson;

public class Example {

    public static void main(String[] args) {

        // this is how we utilize an anonymous inner class (or anonymous interface)
        // we start by instatiating a new Object of the type Interface and implementing
        // the class body after new Interface()
        Printable printable = new Printable() {
            @Override
            public void printSomething() {
                System.out.println("Hello world!");
            }
        };

        printable.printSomething();

    }
}
