package Lesson;

import Lesson.BinaryTree.BinaryTree;

public class Main {

    // today we will be exploring binary trees and heaps!

    // a binary tree is a data structure that holds nodes (just like LinkedList)
    // these nodes hold references to two other nodes

    public static BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(3);
        bt.add(2);
        bt.add(45);
        bt.add(1);
        bt.add(7);
        bt.add(90);
        bt.add(456);

        return bt;
    }

    public static void main(String[] args) {

        BinaryTree bt = createBinaryTree();

        System.out.println(bt);





    }
}
