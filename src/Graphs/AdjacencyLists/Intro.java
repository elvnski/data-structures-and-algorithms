package Graphs.AdjacencyLists;

public class Intro {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        graph.addNode(new Node('F'));

        graph.addEdge(0, 1);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,1);
        graph.addEdge(4,2);
        graph.addEdge(4,3);
        graph.addEdge(4,0);

        graph.print();

    }

}
