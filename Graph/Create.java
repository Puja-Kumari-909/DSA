import java.util.ArrayList;

class Create {

    static void addEdge(ArrayList<ArrayList<Integer>> adj_lList, int u, int v){
        adj_lList.get(u).add(v);
        adj_lList.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj_lList){
        for(int i=0; i<adj_lList.size(); i++){
            System.out.print(i+ " has");
            for(int j=0; j<adj_lList.get(i).size(); j++){
                System.out.print("--> "+ adj_lList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<>(vertex);

        for(int i=0; i<vertex; i++){
            adj_list.add(new ArrayList<>());
        }

        addEdge(adj_list, 0, 1);
        addEdge(adj_list, 0, 4);
        addEdge(adj_list, 1, 2);
        addEdge(adj_list, 1, 3);
        addEdge(adj_list, 1, 4);
        addEdge(adj_list, 2, 3);
        addEdge(adj_list, 3, 4);

        printGraph(adj_list);

    }
}
