package Milestone4;

import java.util.Scanner;

public class LCM {

    static int findLCM(int a, int b){
       int max = Math.max(a, b);
       int lcm;
       int i = max;
       while(true){
            if(i%a==0 && i%b==0){
              lcm = i;
              break;
            }
            i = i + max;
       }
       return lcm;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(findLCM(a, b));
    }
}
