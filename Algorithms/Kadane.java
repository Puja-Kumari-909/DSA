//Kadane's Algorithm for finding maximum sum subarray

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 4, -1, -2, 5, 2, -6, -9};

        int max_sum = arr[0];
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if(sum<0)
                sum=0;
             
            max_sum = Math.max(sum, max_sum);
        }

        System.out.println(max_sum);
    }
}
