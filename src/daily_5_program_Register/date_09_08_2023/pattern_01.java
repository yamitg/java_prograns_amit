package daily_5_program_Register.date_09_08_2023;

public class pattern_01
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=2*i-1;k<=2*n-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
