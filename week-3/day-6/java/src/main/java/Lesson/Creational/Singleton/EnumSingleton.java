package Lesson.Creational.Singleton;

// enums are meant to represent values that can be enumerated through
// and are typically unchanging in and of themselves
// for example: days of the week, months, etc

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
