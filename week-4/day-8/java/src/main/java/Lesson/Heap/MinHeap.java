package Lesson.Heap;

public class MinHeap {

    Node root;


    // TODO: method that adds nodes recursively in accordance to minHeap spec
    // this implementation is bit naive but will hopefully get you on the right track
    // to understanding code implementation

    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        // if block that places our value in the appropriate position
        // this would be a rudimentary swap
        // can you think of a neater way of doing this?
        if ( value < current.value){
            int biggerValue = current.value;
            current.value = value;
            current.left.value = biggerValue;
        }

        if ( value > current.value){
            current.left.value = value;
        }

        return current;
    }



    // TODO: method that deletes nodes recursively

    // TODO: possibly add dedicated swap method

    // how would you implement a minHeap? Would you use an array value?
    // Why or why not? 



}
