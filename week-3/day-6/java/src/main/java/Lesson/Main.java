package Lesson;

import Lesson.Behavioral.Observer.NewsAgency;
import Lesson.Behavioral.Observer.NewsChannel;
import Lesson.Creational.Builder.BankAccount;
import Lesson.Creational.Factory.*;
import Lesson.Creational.Factory.Abstract.AbstractFactory;
import Lesson.Creational.Factory.Abstract.Animal;
import Lesson.Creational.Factory.Abstract.AnimalFactory;
import Lesson.Creational.Factory.Abstract.FactoryProvider;
import Lesson.Creational.Singleton.ClassSingleton;
import Lesson.Creational.Singleton.EnumSingleton;
import Lesson.Creational.Singleton.InnerClassSingleton;

public class Main {

    public static void main(String[] args) {

        // Java Design Patterns
        // In a nutshell, design patterns are solutions
        // for re-occurring problems

        // the biggest thing about patterns is that
        // they are reusable

        // the big three types of patterns are:
        // creational - this defines how code is created
        // structural - this defines how code is structured
        // behavioral - this defines how code behaves

        // Below is an attempt to access a singleton
        // you'll see that the code throws an error
//        MySingleton mySingleton = new MySingleton();

        // below is a more proper way of obtaining a singleton instance
        ClassSingleton classSingleton = ClassSingleton.getInstance();

        System.out.println(classSingleton.getName());


        // below is an example of our InnerClassSingleton
        System.out.println(InnerClassSingleton.getInstance());




        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        System.out.println(EnumSingleton.INSTANCE.getInstance());
        System.out.println(enumSingleton.getInfo());

        PolygonFactory polygonFactory = new PolygonFactory();

        Polygon myTriangle = polygonFactory.getPolygon(3);
        Polygon mySquare = polygonFactory.getPolygon(4);
        Polygon myPentagon = polygonFactory.getPolygon(5);

        System.out.println(myTriangle);
        System.out.println(mySquare);
        System.out.println(myPentagon);

        // below is an implementation of an abstract factory
        // this can be thought of as a "factory of factories"
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");

        Animal myLion = animalFactory.create("Lion");

        System.out.println(myLion.makeSound());


        // below is an example of the builder pattern

        // builder pattern utilized a fluent interface (or fluent design)
        // this means that the API for your object relies heavily on method chaining

        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "34552")
                .withEmail("jon@exampl.com")
                .wantNewsletter(true)
                .build();

        System.out.println(newAccount);

        // observer pattern is below

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Here is the news!");

        System.out.println(observable.getNews());
        System.out.println(observer.getNews());





    }
}
