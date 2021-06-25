package Milestone4;

import java.util.Scanner;

public class SumOfAllPrime {

    static void sumOfPrime(int n){
        boolean[] arr = new boolean[n+1];
        int sum = 0;

        for(int i=1; i<=n; i++){
            arr[i]=true;
        }

        for(int i=2; i*i<=n; i++){
            if(arr[i]==true){
                for(int j=i*i; j<=n; j=j+i){
                    arr[j]=false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(arr[i]==true)
               sum=sum+i;
        }

        System.out.println("Sum of all prime numbers till "+ n +" is: "+ sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sumOfPrime(n);
    }
}
