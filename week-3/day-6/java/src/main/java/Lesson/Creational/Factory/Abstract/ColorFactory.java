package Lesson.Creational.Factory.Abstract;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String type) {
        if ("Brown".equalsIgnoreCase(type)){
            return new Brown();
        } else if ("Red".equalsIgnoreCase(type)){
            return new Red();
        }
        return null;
    }
}
