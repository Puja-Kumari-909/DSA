import java.util.Scanner;

public class Fabusingrecursion {

    static int fab(int n){

      if(n==0){      //base case to stop the recursive call
          return 0;
      }
      if(n==1 || n==2){   //base case to stop the recursive call
          return 1;
      }
      else{
          return fab(n-1)+fab(n-2);    //recursively calling and returning the value 
      }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print(fab(i) +" ");     //printing the returned value on every call from 0-n
        }
        
    }
    
}
