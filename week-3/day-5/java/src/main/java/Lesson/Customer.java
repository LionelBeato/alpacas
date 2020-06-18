package Lesson;

public class Customer {
    private String name;
    private int points;


    public boolean hasOverHundredPoints(){
        return this.points > 100;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
