package Lesson.BinaryTree;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value){
        // this if statement will check if there is a current value
        // if there's no current value, we will return one and add it
        if (current == null){
            return new Node(value);
        }

        // this if statement will attempt to add our value
        // to the left most child node
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    // this method will start the recursive call at the root node
    public void add(int value){
        root = addRecursive(root, value);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    // this method is going to be a recursive function
    // that will check the values of any given current node
    // and return true or false if it matches with our argument value
    // thus creating a basic search
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }

        // this is a ternary operation that is a conditional
        // describing an action if a statement is true or false
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

        public boolean containsNode(int value){
            return containsNodeRecursive(root, value);
        }

        private Node deleteRecursive(Node current, int value){
        if (current == null){
            return null;
        }

        if (value == current.value){
            // ... code to delete node will go here
            // here we will define three cases
            // if the current node has no children
            if(current.left == null && current.right == null){
                return null;
            }
            // if the current node has one child
            if (current.right == null){
                return current.left;
            }
            if (current.left == null){
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }

        if (value < current.value){
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;

        }

        private int findSmallestValue(Node root){
        return root.left == null ? root.value : findSmallestValue(root.left);
        }

        public void delete(int value){
        root = deleteRecursive(root, value);
        }



    }


