import java.util.*;

public class UnionArray {

    static void union(int[]arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            hs.add(arr2[j]);
        }

        
        Iterator<Integer> it = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
      // System.out.print(hs);

    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6};
        int[] arr2 = {10, 5, 6, 0};

        union(arr1, arr2);
    }
}
