package Milestone3;

/*program to swap first and last digit of a number 
the main logic is to get the firstDigit, lastDigit and middleDigits seperated so that
we can make the swapped number by doing firstDigit + middleDigits + lastDigit
swapped = first*(10^(number of digits in given number - 1)) + middle*10 + last   */

import java.util.Scanner;

public class SwapDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();

        int first, last, digit, swapped, divide;

    
        digit = (int) Math.log10(num);      //we get (number of digits in num - 1)

        divide = (int) Math.pow(10, digit);  //gives 10^(number of digits in num - 1) as we need this to multiply to get our new number

        first = num/divide;        //if we divide the num by 10^(number of digits in num - 1) we get the first digit

        num = num%divide;          //here we only get the digits after the first digit

        last = num%10;            //gives the last digit

        num = num/10;             //now here we get all the middle digits of the given number

        swapped = last*divide + num*10 + first;

        System.out.println(swapped);

    }
}
