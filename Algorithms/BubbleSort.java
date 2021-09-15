public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 5, 3, 24, -7, 0, 45};
        int temp = 0;
        boolean isSwapped;
        for(int i=0; i<arr.length; i++){
            isSwapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped!=true){
                break;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
