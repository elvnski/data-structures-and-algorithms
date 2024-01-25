package Trees;

import java.util.Optional;

public class Intro {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(8));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(9));
        tree.insert(new Node(1));
        tree.insert(new Node(4));
        tree.insert(new Node(11));

        tree.display(Optional.of("inOrder"));

        System.out.println("Search result: " + tree.search(1));

        tree.remove(9);

        //In-Order Traversal
        System.out.println("In-Order Traversal");
        tree.display(Optional.empty());

        //Pre-Order Traversal
        System.out.println("Pre-Order Traversal");
        tree.display(Optional.of("preOrder"));

        //Post-Order Traversal
        System.out.println("Post-Order Traversal");
        tree.display(Optional.of("postOrder"));

        //Level-Order Traversal
        System.out.println("Level-Order Traversal");
        tree.display(Optional.of("levelOrder"));

    }


}
