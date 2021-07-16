import java.util.PriorityQueue;
import java.util.Scanner;

//We have used priority queue here because by default it implements min heap and we can use it solve this problem
public class KthLargest {

    static int findEle(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int j=k; j<arr.length; j++){
            if(pq.peek()<arr[j]){
                pq.remove();
                pq.add(arr[j]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10, 60, 30, 20, 40, 50};
        System.out.println("Enter the value of k");
        int k = in.nextInt();
        System.out.println(findEle(arr, k));
    }
}

/*Output:
    Enter the value of k
    4
    30
*/