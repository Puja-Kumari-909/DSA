
public class Duplicates {
    public static void main(String[] args) {

        int[] arr = {9, 7, -10, -4, 3, -25};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
          if(arr[i]>max){
              secMax = max;
              max = arr[i];
          }
          else if(arr[i]!=max && arr[i]>secMax){
              secMax = arr[i];
          }
        }
        System.out.println(secMax);
    }
}
