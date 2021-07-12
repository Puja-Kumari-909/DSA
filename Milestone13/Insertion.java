import javax.swing.plaf.InsetsUIResource;

public class Insertion {

    static void insert(int[] arr){
        int temp,i,j;
        for(i=1; i<arr.length; i++){
            temp = arr[i];
            j= i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    static void print (int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4, 9, 2, 4, 7};
        insert(arr);
        print(arr);
    }
}
