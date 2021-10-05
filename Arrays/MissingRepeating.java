import java.util.Arrays;

class MissingRepeating {

  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 4, 6, 7, 3};

    //using sorting.
    Arrays.sort(arr);
    for(int i=1; i<arr.length; i++){
      if(arr[i]==arr[i-1])
        System.out.println("repeating "+arr[i]);

      if(arr[i]-arr[i-1]>1){
        System.out.println("missing "+ (arr[i]+arr[i-1])/2);
      }
    }

    //by creating a count array
    int[] count = new int [arr.length+1];
    
    for(int i=1; i<count.length; i++){
      count[i] = 0;
    }

    for(int i=0; i<arr.length; i++){
     if(count[arr[i]]==0)
      count[arr[i]] = 1;
     else if(count[arr[i]]==1)
      count[arr[i]] = 2;
    }

    for(int i=1; i<count.length; i++){
      if(count[i]>1)
        System.out.println("Repeating "+ i);
      else if(count[i]==0){
        System.out.println("Missing "+i);
      }
    }
  }  
}
