package Lesson.Creational.Factory.Abstract;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if("Duck".equalsIgnoreCase(animalType)){
            return new Duck();
        } else if ("Lion".equalsIgnoreCase(animalType)) {
            return new Lion();
        }
        return null;
    }
}
