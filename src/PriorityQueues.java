import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public static void main(String[] args) {


        Queue<Double> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);


        //checking the service order
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll() + " Has Been Served!");
        }

        //Reversing the order of service
        Queue<Double> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        reversePriorityQueue.offer(3.0);
        reversePriorityQueue.offer(2.5);
        reversePriorityQueue.offer(4.0);
        reversePriorityQueue.offer(1.5);
        reversePriorityQueue.offer(2.0);

        while (!reversePriorityQueue.isEmpty()){
            System.out.println(reversePriorityQueue.poll() + " Has Been Served!");
        }


        //for a String Priority Queue
        Queue<String> stringPriorityQueue = new PriorityQueue<>();

        stringPriorityQueue.offer("B");
        stringPriorityQueue.offer("C");
        stringPriorityQueue.offer("E");
        stringPriorityQueue.offer("D");
        stringPriorityQueue.offer("A");

        while (!stringPriorityQueue.isEmpty()){
            System.out.println(stringPriorityQueue.poll() + " Has Been Served!");
        }


    }

}
