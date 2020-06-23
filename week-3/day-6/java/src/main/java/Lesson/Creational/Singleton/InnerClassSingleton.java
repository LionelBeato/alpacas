package Lesson.Creational.Singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {}

    private static class SingletonHolder {
        public static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

    @Override
    public String toString() {
        return "This is my instance!";
    }
}
