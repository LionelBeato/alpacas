package Practice;

public class Main {

    public static void main(String[] args) {

        Somethingable somethingable = x -> System.out.println(x);
        Somethingable somethingable1 = System.out::println;


        somethingable.doSomething("Hello, I'm inside of a functional interface implementation!");
        somethingable1.doSomething("Hello, I'm inside of a method reference implementation!");

    }
}
