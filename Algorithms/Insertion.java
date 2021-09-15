public class Insertion {
    public static void main(String[] args) {
        int[] arr = {13, -4, 99, 67, 3, 28, 4};
        int temp =0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
