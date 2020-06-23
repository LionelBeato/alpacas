package Lesson.Creational.Factory;

public class Triangle implements Polygon {

    @Override
    public String getType() {
        return "triangle";
    }

    @Override
    public String toString() {
        return "this is a triangle with 3 sides";
    }
}
