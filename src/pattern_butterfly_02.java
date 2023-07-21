public class pattern_butterfly_02
{
    public static void main(String[] args)
    {
        int n=8; int m=13;
        for (int i=0; i<n; i++)
        {
            for(int j=0;j<=i; j++)
            {
                System.out.print("* ");
            }
            for (int k=n ; k>=i+2;k--)
            {
                System.out.print("  ");
            }
            for (int k=n;k>i+1;k--)
            {
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i=0; i<n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print("* ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("  ");
            }
            for (int j=n; j>i; j--)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
