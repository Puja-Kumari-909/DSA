package Milestone3;

import java.util.Scanner;

// A number is palindrome if it is the same number when its reversed eg 121

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int remainder=0;
        int reverseNum = 0;
        int tempNum = num;

        while(tempNum>0){
           remainder = tempNum%10;
           reverseNum = reverseNum*10 + remainder;
           tempNum = tempNum/10;
        }

        if(reverseNum==num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
