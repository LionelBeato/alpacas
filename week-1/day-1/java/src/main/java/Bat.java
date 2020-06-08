public class Bat extends Mammal implements Flyable, Implementable{


    public Bat(boolean hasFur, boolean isWarmBlooded, boolean isFluffy, int legs, boolean doesFly, String name) {
        super(hasFur, isWarmBlooded, isFluffy, legs, doesFly, name);
    }

    @Override
    public String isFlyable() {
        return "Your bat flew";
    }

    @Override
    public String implementMePlease() {
        return "this method has been implemented!";
    }
}
