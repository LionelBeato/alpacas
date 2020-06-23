package Lesson.Creational.Factory.Abstract;

public class FactoryProvider {
    // this use of a raw type will throw a warning
    // be very careful when doing something like this!
    public static AbstractFactory getFactory(String choice){
        if ("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if ("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
