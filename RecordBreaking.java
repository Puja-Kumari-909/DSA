public class RecordBreaking {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 0, 7, 2, 0, 2, 22};
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
          if(i==0){
           if(arr[i]>arr[i+1]){
               System.out.println("Record Breaking Day: "+ arr[i]);
           }
          }

          if(i==n-1){
            if(arr[i]>max){
                System.out.println("Record Breaking Day: "+ arr[i]);
            }
          }


          else{
             if(arr[i]>max && arr[i]>arr[i+1]){
                System.out.println("Record Breaking Day: "+ arr[i]);
             }
          }
          
          max = Math.max(arr[i], max);
        }
    }
}
