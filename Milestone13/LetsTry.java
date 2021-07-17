public class LetsTry {
    static void mergeIt(int[] arr, int l, int m, int r){
        int size1 = m-l+1;
        int size2 = r-m;
        
        //create two temp arrays
        int[] L = new int [size1];
        int[] R = new int [size2];

        //copy the elements in these new temp arrays
        for(int i=0; i<size1; i++){
            L[i] = arr[l+i];
        }

        for(int j=0; j<size2; j++){
            R[j] = arr[m+1+j];
        }

        // now merge the two temp arrays and store the elements in sorted order in the original array

        int i=0, j=0;
        int k = l; // we are taking this pointer to point in the original array 
        
        while(i<size1 && j<size2){
            if(L[i]<=R[j] && Math.abs(L[i]-R[j]) >= 10){
                arr[k] = L[i];
                i++;
            }
            else if(Math.abs(L[i]-R[j]) < 10){
                arr[k] = L[i];
                arr[++k] = R[j];
                i++;
                j++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //store the elements of L[] if some are left
        while(i<size1){
            arr[k] = L[i];
            k++;
            i++;
        }

        while(j<size2){
            arr[k] = R[j];
            k++;
            j++;
        }

    }
    
    static void divide(int[] arr, int l, int r){
        if(l<r){
            int mid = (l + r)/2;

            divide(arr, l, mid);
            divide(arr, mid+1, r);
            mergeIt(arr, l, mid, r);
        }

        
    }

    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 33, 50, 32, 31, 40, 70, 60};
        int l = 0;
        int r = arr.length-1;
        divide(arr, l, r);
        
        print(arr);
    }
}
