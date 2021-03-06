import java.util.Arrays;

public class PrintTriangle {

    static void printTriangle(int[] arr){
        if(arr.length<1)
            return;
        
        int[] temp = new int[arr.length-1];

        for(int i=0; i<arr.length-1; i++){
            temp[i] = arr[i]+arr[i+1];
        }

        printTriangle(temp);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        printTriangle(arr);
    }
}