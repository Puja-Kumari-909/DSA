import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {

    static void intersection(int[] arr1, int[] arr2){
       
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            if(hs.contains(arr2[j])){
                arrayList.add(arr2[j]);
                hs.remove(arr2[j]);
            }
        }

        System.out.println(arrayList);        
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7};
        int[] arr2 = {10, 5, 6, 7};

       intersection(arr1, arr2);
    }
}
