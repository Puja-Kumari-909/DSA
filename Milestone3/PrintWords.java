package Milestone3;

import java.util.Scanner;

public class PrintWords {

    static void words(int a){
        switch(a){
        case 0:
            System.out.print("Zero"+" ");
            break;
        case 1:
            System.out.print("One"+" ");
            break;
        case 2:
            System.out.print("Two"+" ");
            break;
        case 3:
            System.out.print("Three"+" ");
            break;
        case 4:
            System.out.print("Four"+" ");
            break;
        case 5:
            System.out.print("Five"+" ");
            break;
        case 6:
            System.out.print("Six"+" ");
            break;
        case 7:
            System.out.print("Seven"+" ");
            break;
        case 8:
            System.out.print("Eight"+" ");
            break;
        case 9:
            System.out.print("Nine"+" ");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        int firstDigit;
        while(num>0){
            firstDigit = (int) ((int) num/(Math.pow(10,(int) Math.log10(num))));
            words(firstDigit);
            num=(int) (num%((Math.pow(10,(int) Math.log10(num)))));
        }  
    }
}
