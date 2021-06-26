package Milestone5;

import java.util.Scanner;

public class Perfect {

    static void isPerfect(int n){
        int sum = 0;

        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }

        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        isPerfect(num);
    }
}
