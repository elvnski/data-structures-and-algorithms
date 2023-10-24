import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        //Treating it as a stack
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.pop();

        System.out.println("A stack LinkedList: " + linkedList);

        //Treating it as a queue
        LinkedList<String> linkedListTwo = new LinkedList<String>();

        linkedListTwo.offer("A");
        linkedListTwo.offer("B");
        linkedListTwo.offer("D");
        linkedListTwo.offer("E");
        linkedListTwo.offer("F");
        linkedListTwo.offer("G");
        linkedListTwo.offer("H");
        linkedListTwo.poll();

        System.out.println("A queue LinkedList: " + linkedListTwo);

        //Adding an element to the middle of a list
        linkedListTwo.add(2, "Y");
        System.out.println("Added element Y: " + linkedListTwo);

        //Adding an element to the middle of a list
        linkedListTwo.remove("Y");
        System.out.println("Removed element Y: " + linkedListTwo);

        //Searching for a node
        System.out.println("Index of 'F': " + linkedListTwo.indexOf("F"));

        //Looking at the FIRST node
        System.out.println("The FIRST node: " + linkedListTwo.peekFirst());

        //Looking at the FIRST node
        System.out.println("The LAST node: " + linkedListTwo.peekLast());

        //Adding a node to the HEAD of our LinkedList
        linkedListTwo.addFirst("HEAD");

        //Adding a node to the TAIL of our LinkedList
        linkedListTwo.addLast("TAIL");

        System.out.println(linkedListTwo);

        //Removing a node on the HEAD of our LinkedList
        String first = linkedListTwo.removeFirst();

        //Removing a node on the TAIL of our LinkedList
        String last = linkedListTwo.removeLast();


    }

}
