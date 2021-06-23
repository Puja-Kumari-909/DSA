package Milestone3;

//program to find product of all digits in a number

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int prod=1;

        while(num>0){
            prod = prod*(num%10);
            num = num/10;
        }
        System.out.println(prod);
    }
}
