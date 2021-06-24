package Milestone4;

import java.util.Scanner;

public class Power {

    static long pow(int n, int e){
        long power=1;
        for(int i=1; i<=e; i++){
            power=power*n;
        }
        return power;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base number");
        int base = in.nextInt();
        System.out.println("Enter exponent");
        int exp = in.nextInt();
        System.out.println(pow(base, exp));
    }
}
