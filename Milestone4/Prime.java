package Milestone4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i=2; i<=num/2; i++){
           if(num%i==0){
               System.out.println("Not a prime number");
               break;
           }
            else{
               System.out.println("Prime number");
               break;
            }
        }
       
    }
}
