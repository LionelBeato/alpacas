package Lesson;

public class Main implements Printable {


    @Override
    public void printSomething() {

        System.out.println("Hello there!");

    }

    public static void main(String[] args) {
        Main main = new Main();

        main.printSomething();
    }
}
