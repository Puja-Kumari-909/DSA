package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*  WHY BFS WORKS HERE?
 *  because the cost is same in both the operation which is 1
 *  so if we try to go from the src node to the destination node using bfs
 *  then we are always going to find the nodes which are possible to reach from
 *  the src node on that level with the minimun number of operations
 */

public class MinOperations {

    static class Node{
        int data;
        int steps;

        Node(int d, int s){
            data = d;
            steps = s;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 9;

        System.out.println(helper(x, y));
    }

    private static int helper(int x, int target) {
        Set<Integer> visited = new HashSet<>(1000);
        Queue<Node> q = new LinkedList<>();

        // operations required to reach the src node itself is always zero
        q.add(new Node(x, 0));
        visited.add(x);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Node temp = q.poll();
                int data = temp.data;
                int steps = temp.steps;

                if(data == target){
                    return steps;
                }

                int nodeByMultiplication = data * 2;
                int nodeBySubtraction = data - 1;

                if(nodeByMultiplication>0 && nodeByMultiplication<1000){
                    q.add(new Node(nodeByMultiplication, steps+1));
                }

                if(nodeBySubtraction>0 && nodeBySubtraction<1000){
                    q.add(new Node(nodeBySubtraction, steps+1));
                }
            }
        }

        return -1;
    }
}
