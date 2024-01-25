package Graphs.AdjacencyLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> adjacencyList;

    Graph(){
        adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node){

        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);

        adjacencyList.add(currentList);
    }

    public void addEdge(int source, int destination){

        //Getting the linkedList of the target node
        LinkedList<Node> currentList = adjacencyList.get(source);
        //getting the address of the node we'd like to link to
        Node destinationNode = adjacencyList.get(destination).get(0);
        //adding the node to the tail of our target node
        currentList.add(destinationNode);
    }

    public boolean checkEdge(int source, int destination){

        //Getting the linkedList of the target node
        LinkedList<Node> currentList = adjacencyList.get(source);
        //getting the address of the node we'd like to link to
        Node destinationNode = adjacencyList.get(destination).get(0);

        for (Node node : currentList){
            if (node == destinationNode){
                return true;
            }
        }

        return false;
    }

    public void print(){

        for(LinkedList<Node> currentList : adjacencyList){

            for (Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
