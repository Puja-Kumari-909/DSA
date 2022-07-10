package Graph;

import java.util.ArrayList;

/**
 * GraphRepresentation
 */
public class GraphRepresentation {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j){
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 4);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 1, 2);

        for(int i=0; i<adj.size(); i++){
            System.out.print("Adjecency list of " + i + "--> ");
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }

}


/*
Adjecency list of 0--> 4 
Adjecency list of 1--> 4 2
Adjecency list of 2--> 3 1
Adjecency list of 3--> 2 4
Adjecency list of 4--> 0 1 3 
*/