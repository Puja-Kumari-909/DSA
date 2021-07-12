//QuickSort

public class Quick {

    static int partition(int[] arr, int lb, int up){
        int pivot = arr[lb];
        int start = lb;
        int end = up;
        int temp;

        while(start<end){
            while(arr[start]<=pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
            }
        }
         temp = arr[end];
         arr[end] = arr[lb];
         arr[lb] = temp;

         return end;
    }

    static void quicky(int[] arr, int lb, int up){
        if(lb<up){
            int location = partition(arr, lb, up);

            quicky(arr, lb, location-1);
            quicky(arr, location+1, up);
        }
    }

    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4, 9, 2, 4, 7};
        int lb = 0;
        int up = arr.length-1;

        quicky(arr, lb, up);
        print(arr);
    }
}
