import java.util.Scanner;

//program to print numbers in reverse
public class PrintNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = n;
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }
    }
}
