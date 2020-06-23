package Lesson.Creational.Singleton;

// below is an example of a classSingleton
// this singleton is utilized by simply creating a class
public class ClassSingleton {

    private final String name;
    static ClassSingleton classSingleton = new ClassSingleton("Lionel");


    private ClassSingleton(String name) {
        this.name = name;
    }

    public static ClassSingleton getInstance(){
        if(classSingleton == null){
            classSingleton = new ClassSingleton("Lionel");
        }
        return classSingleton;
    }

    public String getName(){
        return name;
    }


}
