package Lesson.MiscCollections;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println(stringStack);

        stringStack.pop();

        System.out.println(stringStack);
        System.out.println(stringStack.peek());

        stringStack.empty();



    }
}
