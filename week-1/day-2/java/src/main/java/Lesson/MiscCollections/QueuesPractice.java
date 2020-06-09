package Lesson.MiscCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesPractice {

    public static void main(String[] args) {

        // this is how you would initialize a queue
        // a queue is technically an interface
        // you declare it as a LinkedList
        Queue<String> stringQueue = new LinkedList<>();

        // add will add at the tail
        stringQueue.add("One");
        stringQueue.add("Two");
        stringQueue.add("Three");

        System.out.println(stringQueue);

        // remove will remove from the head
        stringQueue.remove();

        System.out.println(stringQueue);
        System.out.println(stringQueue.peek());




    }
}
