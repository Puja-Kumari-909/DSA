import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {

    static int findElement(int[] arr, int k){

        //this constructor parameter makes it max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int j=k; j<arr.length; j++){
            if(pq.peek()>arr[j]){
                pq.remove();
                pq.add(arr[j]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {7, 9, 34, 2, -2, 9, 0, -5};
        System.out.println("Enter the value of k");
        int k = in.nextInt();
        System.out.println(findElement(arr, k));
    }
}
