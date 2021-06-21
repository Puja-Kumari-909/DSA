import java.util.Scanner;

public class Pattern4
 {
    public static void main(String[] args)
    {
        int c = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++)
        {
            c=1;
            for(int j=1; j<=(n-i+1); j++){
              System.out.print(c+" ");        //instead of c we could use j as we are printing the same nums in every column
              c++;
            }
            System.out.println();
        }
    }
}
