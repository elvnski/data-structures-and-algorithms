package Trees;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class BinarySearchTree {


    Node root;

    public void insert(Node node){

        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){

        int data = node.data;

        if (root == null) {

            root = node;
            return root;
        }
        else if (data < root.data){

            root.left = insertHelper(root.left, node);
        }
        else {

            root.right = insertHelper(root.right, node);
        }

        return root;
    }

    public void display(Optional<String> traversalMethod){

        String method = traversalMethod.orElse("inOrder");

        displayHelper(root, Optional.of(method));
    }

    private void displayHelper(Node root, Optional<String> traversalMethod){

        String method = traversalMethod.orElse("inOrder");

        if (root != null) {

            //In-order Traversal
            if (method.equals("inOrder") ) {

                displayHelper(root.left, traversalMethod);
                System.out.println(root.data);
                displayHelper(root.right, traversalMethod);
            }

            //Pre-order Traversal
            else if (method.equals("preOrder") ) {

                System.out.println(root.data);
                displayHelper(root.left, traversalMethod);
                displayHelper(root.right, traversalMethod);
            }

            //Post-order Traversal
            else if (method.equals("postOrder") ) {

                displayHelper(root.left, traversalMethod);
                displayHelper(root.right, traversalMethod);
                System.out.println(root.data);
            }

            // Level-order traversal
            else if (method.equals("levelOrder")) {
                levelOrderTraversal(root);
            }

        }
    }

    private void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data);

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public boolean search(int data){

        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){

        if (root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (data < root.data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){

        if (search(data)){
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not be found...");
        }
    }

    private Node removeHelper(Node root, int data){

        if (root == null) {
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else {

            if (root.left == null && root.right == null){
                root = null;
            }
            else if (root.right != null) {

                //Find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else {

                //Find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }

        return root;
    }

    //Attempts to find the least value below the right child of this root node
    private int successor(Node root){

        root = root.right;
        while (root.left != null){

            root = root.left;
        }

        return root.data;
    }

    //Attempts to find the greatest value below the left child of this root node
    private int predecessor(Node root){

        root = root.left;
        while (root.right != null){

            root = root.right;
        }

        return root.data;
    }

}
