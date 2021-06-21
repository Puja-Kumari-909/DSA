import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j<=(n-i))
                {
                    System.out.print("  "); //adding two space
                }
                else{
                    System.out.print("* ");  // adding one space after *
                }
            }
            System.out.println();
        }
    }
}
