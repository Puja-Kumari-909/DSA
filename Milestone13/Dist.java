import java.util.HashSet;

public class Dist {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 7, 7, 0, 1, 6, 3};
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }

        System.out.println(hs.size());

    }
}
