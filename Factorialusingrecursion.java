import java.util.Scanner;

public class Factorialusingrecursion {

    static int facto(int n){
      if(n==0 || n==1){       //base condition to stop the recursive function
          return 1;
      }
      else{
          return n * facto(n-1);  //calling the same function with a smaller value everytime
      }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(facto(n));
    }
    
}
