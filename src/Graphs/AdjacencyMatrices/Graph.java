package Graphs.AdjacencyMatrices;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){

        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int source, int destination){

        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination){

        if (matrix[source][destination] == 1) return true;
        return false;
    }

    public void print(){

        System.out.print("  ");
        for (Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++){

            System.out.print(nodes.get(i).data + " ");
            for (int k = 0; k < matrix[i].length; k++){
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

    }

}
