package Lesson.Creational.Singleton;

// below is an example of a classSingleton
// this singleton is utilized by simply creating a class
// this is perhaps the most common design pattern and one of the most covered
// in text
public class ClassSingleton {

    private final String name;
    // we can add a value to this singleton in our getInstance() method
    // note that this field is static, thus belonging to the Class itself and not an implementation
    // this ensures there's only ever one singleton instance
    static ClassSingleton classSingleton;


    // private constructor meaning we can only use it within this class
    private ClassSingleton(String name) {
        this.name = name;
    }

    public static ClassSingleton getInstance(){
        if(classSingleton == null){
            // adding a value to our field
            classSingleton = new ClassSingleton("Lionel");
        }
        return classSingleton;
    }

    public String getName(){
        return name;
    }


}
