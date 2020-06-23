package Lesson.Creational.Factory;

public class Square implements Polygon {

    @Override
    public String getType() {
        return "square";
    }

    @Override
    public String toString() {
        return "this is a square with 4 sides";
    }
}
