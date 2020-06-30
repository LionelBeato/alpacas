package Lesson.BinaryTree;

import org.junit.Test;
import Lesson.Main;

import static Lesson.Main.createBinaryTree;
import static org.junit.Assert.*;

public class BinaryTreeTest {

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