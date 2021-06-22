package Milestone3;

import java.util.Scanner;

public class SumFirstLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum=0;
        int first=0;
        int last = num%10;

        while(num>10){
            num=num/10;
        }
        first=num;

        sum=first+last;
        System.out.println("Sum of first and last digit is " +sum);
    }
}
