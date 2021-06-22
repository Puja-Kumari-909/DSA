import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
