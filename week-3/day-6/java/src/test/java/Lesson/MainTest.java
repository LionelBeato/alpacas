package Lesson;

import Lesson.Behavioral.Observer.NewsAgency;
import Lesson.Behavioral.Observer.NewsChannel;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main(){
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Here is the news!");

        assertEquals("Here is the news!", observer.getNews());
    }

    @Test
    public void test(){
        assertEquals("3", "3");

    }

}