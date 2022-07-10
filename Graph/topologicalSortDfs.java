package Graph;

import java.util.ArrayList;
import java.util.Stack;
/*
 * Topological Sort is linear ordering of vertices such that for every directed edge u --> v, vertex u comes before v in the ordering
 * In simple words the vertices which are not depending on any other vertex should come last
 * It is mostly used in the types of problems where one task is dependent on the completion of other task.
 * Using dfs its very easy to go deep within the node which is not dependent on any node and store it somewhere and keep on doing
 * it till the entire graph is visited and then simply reverse the ans and return it
 */
public class topologicalSortDfs {
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j){
        adj.get(i).add(j);
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 1, 2);

        boolean vis[] = new boolean[v];
        Stack<Integer> st = new Stack<>();
        
        for(int i= 0; i<v; i++){
            if(!vis[i])
                topoDfs(i, adj, vis, st);
        }

        while(!st.isEmpty()){
            System.out.print(st.pop() +" ");
        }
        
    }
 

    static void topoDfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> st){
        
        vis[node] = true;
        
        for(int adjNode : adj.get(node)){
            if(!vis[adjNode]){
                topoDfs(adjNode, adj, vis, st);
            }
        }
        st.push(node);
    }
}
