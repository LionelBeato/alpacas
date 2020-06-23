package Lesson.Creational.Factory;

public class PolygonFactory {

    public Polygon getPolygon(int numberofSides){
        if(numberofSides == 3){
            return new Triangle();
        }
        if(numberofSides == 4){
            return new Square();
        }
        if(numberofSides == 5){
            return new Pentagon();
        }
        return null;
    }
}
