public class Mammal extends Animal{


    private boolean hasFur;
    private boolean isWarmBlooded;

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        isWarmBlooded = warmBlooded;
    }

    public Mammal(boolean hasFur, boolean isWarmBlooded, boolean isFluffy, int legs, boolean doesFly, String name) {
        super(isFluffy, legs, doesFly, name);
        this.hasFur = hasFur;
        this.isWarmBlooded = isWarmBlooded;
    }
}
