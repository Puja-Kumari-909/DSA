package Milestone4;

import java.util.Scanner;

public class PrimeFactor {

    static boolean isPrime(int i){

        for(int j=2; j<=i/2; j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    static void primeFact(int n){
        for(int i=2; i<=n; i++){
            if(n%i==0){
               if(isPrime(i)){
                   System.out.print(i+" ");
               }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        primeFact(num);
    }
}
