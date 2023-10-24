import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //Displaying our queue
        System.out.println(queue);

        //getting the object at the head of the queue
        System.out.println("At the head is: " + queue.peek());

        //Removing the object at the head of the queue
        queue.poll();
        System.out.println("Our Updated Queue: " + queue);

        //Checking if our queue is empty
        System.out.println("Is our Queue Empty? " + queue.isEmpty());

        //Checking the size of our queue
        System.out.println("The Size of Our Queue is: " + queue.size());

        //Checking if an Object is in Our Queue
        System.out.println("Is Harold in the queue? " + queue.contains("Harold"));


    }

}
