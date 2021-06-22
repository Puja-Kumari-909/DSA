package Milestone3;

import java.util.Scanner;

public class PrintFristandLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first=0;
        int last=n%10;

        while(n>10){
         n=n/10;
        }
        first = n;
        System.out.println("first digit is "+ first);
        System.out.println("last digit is "+ last);
    }
}
