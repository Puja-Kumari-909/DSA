package Graph;

import java.util.ArrayList;

public class dfsTraversal {

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

        boolean[] vis = new boolean[5];
        dfs(adj, vis, 0);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[]vis, int node){
        if(vis[node])
            return;

        vis[node] = true;

        System.out.print(node+" ");

        for(int adjNode : adj.get(node)){
            dfs(adj, vis, adjNode);
        }
    }
}


/*
 0 4 1 2 3 
 */