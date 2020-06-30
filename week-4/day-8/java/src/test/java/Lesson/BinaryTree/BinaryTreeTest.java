package Lesson.BinaryTree;

import org.junit.Test;
import Lesson.Main;

import static Lesson.Main.createBinaryTree;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    // here we're using Junit 4 to write our unit tests
    // this implementation is using the Intellij testing rather than gradle on my end
    // but it may work on your system with gradle

    // note that Junit 4 uses annotations
    // this makes it easier to write tests that are clearer and concise
    // note how verbose the test name is by itself
    // this makes it clear what exactly it is that we're testing
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements(){
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(45));
        assertTrue(bt.containsNode(90));
        assertTrue(bt.containsNode(456));

        assertFalse(bt.containsNode(4));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements(){
        BinaryTree bt = createBinaryTree();
        assertTrue(bt.containsNode(45));
        bt.delete(45);
        assertFalse(bt.containsNode(45));
        System.out.println(bt);
    }



}