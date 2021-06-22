import java.util.Scanner;

//program to find number of digits in a given number

public class NumOfDigits {

    static int findDigit(int n){
        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        System.out.println(findDigit(n));
        
    }
}
