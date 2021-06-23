package Milestone3;

//program to find the freqency of digits in a number

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int[] arr = new int[10];
        for(int i=0; i<10; i++) 
            arr[i]=0;

        int lastDigit = 0;

        while(num>0){
            lastDigit = num%10;
            num=num/10;
            arr[lastDigit]++;
        }

        for(int i=0; i<10; i++){
            System.out.println("Frequency of "+i+" is: "+arr[i]);
        }
    }
}
