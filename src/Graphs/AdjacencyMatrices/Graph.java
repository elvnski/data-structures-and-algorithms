package Graphs.AdjacencyMatrices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size){

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


    public void depthFirstSearch(int source){

        boolean[] visited = new boolean[matrix.length];

        dfsHelper(source, visited);
    }

    private void dfsHelper(int source, boolean[] visited) {

        if (visited[source]){
            return;
        }
        else {
            visited[source] = true;
            System.out.println(nodes.get(source).data + " = visited");
        }

        //Looping through the rows
        for (int i = 0; i < matrix[source].length; i++){

            if (matrix[source][i] == 1){
                dfsHelper(i, visited);
            }
        }

        return;
    }


    public void breadthFirstSearch(int source){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()){

            source = queue.poll();
            System.out.println(nodes.get(source).data + " = visited");

            for (int i = 0; i < matrix[source].length; i++){

                if (matrix[source][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

    }


}
