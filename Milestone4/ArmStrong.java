package Milestone4;

import java.util.Scanner;

public class ArmStrong {

    static int findDigits(int n){
        int c=0;
        while(n>0){
           n=n/10;
            c++;
        }
         return c;
    }

    static void isArmstrong(int num){
        int sum = 0;
        int rem;
        int tempNum = num;

        int num_of_digits = findDigits(num);
        while(tempNum>0){
            rem = tempNum%10;
            sum = sum + (int) Math.pow(rem, num_of_digits);
            tempNum=tempNum/10;
        }

        if(sum==num){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isArmstrong(num);
    }
}
