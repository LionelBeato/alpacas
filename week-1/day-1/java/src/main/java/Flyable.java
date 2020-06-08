// this interface allows us to provide implementation for a method on a case by case basis
// this solves several problems related to single-inheritance in Java
// the most famous of which is the "diamond problem"

public interface Flyable {
    String isFlyable();
}
