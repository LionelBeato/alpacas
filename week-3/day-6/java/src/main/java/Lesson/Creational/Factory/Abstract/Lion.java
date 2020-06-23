package Lesson.Creational.Factory.Abstract;

public class Lion implements Animal {
    @Override
    public String getAnimal() {
        return "Lion";
    }

    @Override
    public String makeSound() {
        return "roar";
    }
}
