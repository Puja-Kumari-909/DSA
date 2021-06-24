package Milestone4;

import java.util.Scanner;

public class Factors {

    static void factor(int n){
        for(int i=1; i<=n/2; i++){
            if(n%i==0)
               System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        factor(num);
    }
}
