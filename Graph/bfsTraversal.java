package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsTraversal {
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

        bfs(adj, 0);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int node){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[5];

        q.add(node);
        vis[node] = true;
        while(! q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                int curr = q.poll();
                System.out.print(curr + " ");
                for(int adjNode : adj.get(curr)){
                    if(!vis[adjNode]){
                        q.add(adjNode);
                        vis[adjNode] = true;
                    }
                }
            }
        }
    }
}
