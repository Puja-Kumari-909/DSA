package Milestone4;

import java.util.Scanner;

//program to find all prime numbers till n

public class SieveAlgo {

    static void sieve(int n){
        boolean[] arr = new boolean[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = true;
        }

        for(int p=2; p*p<=n; p++){
            if(arr[p]==true){
                for(int i = p*p; i<=n; i+=p){
                   arr[i]=false;
                }
            }
        }

        System.out.println("Prime numbers are: ");
       
        for(int i=2; i<=n; i++){
            if(arr[i]==true){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sieve(n);
    }
}
