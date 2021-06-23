package Milestone3;

//program to reverse a number

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int reverse_num=0;
        int rem;

        while(num>0){
            rem = num%10;
            reverse_num = reverse_num*10 + rem;
            num=num/10;
        }
        System.out.println(reverse_num);
    }
}
