package Lesson.Creational.Factory;

public class Pentagon implements Polygon{


    @Override
    public String getType() {
        return "pentagon";
    }

    @Override
    public String toString() {
        return "this is a pentagon with 5 sides";
    }
}
