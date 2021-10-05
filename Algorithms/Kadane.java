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

//Kadane's Algorithm for finding maximum sum subarray if all the elements are negative

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -4, -1, -2, -5, -2, -6, -9};

        int max_sum = arr[0];
        int sum =arr[0];

        for(int i=1; i<arr.length; i++){
           sum = Math.max(arr[i], sum+arr[i]);
           max_sum = Math.max(sum, max_sum);
        }

        System.out.println(max_sum);
    }
}
