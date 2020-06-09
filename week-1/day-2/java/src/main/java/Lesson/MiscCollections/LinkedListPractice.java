package Lesson.MiscCollections;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {


        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("One");
        myLinkedList.add("Two");

        // peek will look at the fist element of a list
        // this is a quick way for you see the very first element
        System.out.println(myLinkedList.peek());
    }

}
