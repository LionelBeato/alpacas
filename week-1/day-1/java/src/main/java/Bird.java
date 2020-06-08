public class Bird extends Animal implements Flyable {
    public Bird(boolean isFluffy, int legs, boolean doesFly, String name) {
        super(isFluffy, legs, doesFly, name);
    }

    @Override
    public String isFlyable() {
        return "Your bird flew";
    }
}
