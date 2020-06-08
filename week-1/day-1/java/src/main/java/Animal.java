// what the heck is a class?
// a class is quite literally a "blueprint" for your objects

public class Animal {
    //these are your class members(aka: attributes/properties/class variables)

    private boolean isFluffy;
    private int legs;
    private boolean doesFly;
    private String name;

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isDoesFly() {
        return doesFly;
    }

    public void setDoesFly(boolean doesFly) {
        this.doesFly = doesFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(boolean isFluffy, int legs, boolean doesFly, String name) {
        this.isFluffy = isFluffy;
        this.legs = legs;
        this.doesFly = doesFly;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isFluffy=" + isFluffy +
                ", legs=" + legs +
                ", doesFly=" + doesFly +
                ", name='" + name + '\'' +
                '}';
    }
}
