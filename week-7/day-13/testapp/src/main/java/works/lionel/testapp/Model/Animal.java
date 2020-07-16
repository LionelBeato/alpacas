package works.lionel.testapp.Model;

import javax.persistence.*;

import java.util.Objects;


@Entity
public class Animal {

    private String name;
    private int amountOfLegs;
    private String color;
    private boolean isFluffy;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Animal(String name, int amountOfLegs, String color, boolean isFluffy) {
        this.name = name;
        this.amountOfLegs = amountOfLegs;
        this.color = color;
        this.isFluffy = isFluffy;
    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return amountOfLegs == animal.amountOfLegs &&
                isFluffy == animal.isFluffy &&
                id == animal.id &&
                name.equals(animal.name) &&
                color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfLegs, color, isFluffy, id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", amountOfLegs=" + amountOfLegs +
                ", color='" + color + '\'' +
                ", isFluffy=" + isFluffy +
                ", id=" + id +
                '}';
    }
}
