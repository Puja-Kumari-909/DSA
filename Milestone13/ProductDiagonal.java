package Milestone6;

import java.util.Scanner;

public class ProductDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int prod1 = 1;
        int prod2 = 1;

        //for the primary diagonal
        System.out.print("Primary Diagonal product is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j)
                  prod1*=arr[i][j];
            }
        }
        System.out.print(prod1);

        System.out.println();

        //for the secondary diagonal
        System.out.print("Secondary Diagonal product is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i+j==2)
                prod2*=arr[i][j];
            }
        }
        System.out.print(prod2);
    }
}
