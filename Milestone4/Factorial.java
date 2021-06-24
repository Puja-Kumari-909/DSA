package Milestone4;

import java.util.Scanner;

public class Factorial {

    static void findFactorial(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
           fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        findFactorial(num);
    }
}
