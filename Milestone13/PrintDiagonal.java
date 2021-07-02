package Milestone6;

import java.util.Scanner;

public class PrintDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = in.nextInt();
            }
        }

        //for the primary diagonal
        System.out.print("Primary Diagonal: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j)
                  System.out.print(arr[i][j]+" ");
            }
        }
        
        //for the secondary diagonal
        System.out.println();
        System.out.print("Secondary Diagonal: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i+j==2)
                  System.out.print(arr[i][j]+" ");
            }
        }
    }
}
