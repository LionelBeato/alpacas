public class Main {

    // what is a main method?
    // main method is an "entry point" for your program that tells Java how to launch your application
    // main threads are another name for it

    public static int add(int foo, int bar){
        return foo + bar;
    }

    public static void main(String[] args) {

        // Java like most languages will have primitive values
        int x = 3;
        Integer foo = 3;
        char c = 'a';

        // this is a variable declaration
        // left hand side has the type and reference/name
        // right hand side has the value/literal
        String myString = "My Name is Lionel";
        String myOtherString = new String("My name is also Lionel");
        String yetAnotherString = new String("Hello");

        System.out.println("Hello World!");
        System.out.println(myString);
        System.out.println(myOtherString);

        System.out.println(add(5,2));

        // Object is the superclass of all other classes and is at the top of the Java class hierarchy
        Object myObject = new Object();

        System.out.println(myObject);

        Animal myAnimal = new Animal(true, 4, false, "dog");
        Mammal myMammal = new Mammal(true, true, true, 4, false, "dog");
        Bird myBird = new Bird(true,2,true,"seagull");
        Bat myBat = new Bat(true,true,true,2,true,"fruit bat");

        System.out.println("My animal has this amount of legs: " + myAnimal.getLegs());
        System.out.println("My mammal has this amount of legs: " + myMammal.getLegs());

        System.out.println(myAnimal);

        System.out.println(myBird.isFlyable());
        System.out.println(myBat.isFlyable());





    }
}
