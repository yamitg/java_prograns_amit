package pattern_questions;

public class pattern_butterfly
{
    public static void main(String[] args)
    {
        int n = 7;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            for (int k = n-1; k > i; k--)
            {
                System.out.print("  ");
            }
            for (int m = n - 1; m > i; m--)
            {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = n-1; j > i; j--)
            {
                System.out.print("* ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("  ");
            }
            for(int m=n-1;m>i;m--)
            {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}

