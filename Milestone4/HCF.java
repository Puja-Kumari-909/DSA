package Milestone4;

import java.util.Scanner;

public class HCF {

    static int findHCF(int a, int b){
        int min = Math.min(a, b);
        int hcf = 1;
        for(int i=1; i<=min; i++){
           if(a%i==0 && b%i==0){
               hcf = i;
           }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(findHCF(a, b));
    }
}
