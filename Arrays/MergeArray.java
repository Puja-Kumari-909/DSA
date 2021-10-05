import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 9};
        int[] arr2 = {3, 5, 7};

        //take an extra array
        int[] temp = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length; i++){
            temp[i] = arr1[i];
        }
        
        for(int i=arr1.length, j=0; i<temp.length; i++, j++){
            temp[i] = arr2[j];
        }

        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]+" ");
        }
        Arrays.sort(temp);
        for(int i=0; i<arr1.length; i++){
            arr1[i] = temp[i]; 
        }

        for(int i=0,j=arr1.length; i<arr2.length; i++, j++){
            arr2[i] = temp[j];
        }

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

        //without using extra space
        
        int i=0;
        int j=0;
        int swap=0;

        while(i<arr1.length){
            if(arr1[i]>arr2[j]){
                swap=arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = swap;

                Arrays.sort(arr2);
            }
            i++;
        }

         for(int k=0; k<arr1.length; k++){
            System.out.print(arr1[k]+" ");
        }
        System.out.println();
        for(int k=0; k<arr2.length; k++){
            System.out.print(arr2[k]+" ");
        }

        // Using gap algorithm - TO-DO
    }
}
