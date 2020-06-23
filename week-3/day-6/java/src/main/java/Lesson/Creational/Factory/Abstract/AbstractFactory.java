package Lesson.Creational.Factory.Abstract;

public interface AbstractFactory<T> {
    T create(String type);
}
