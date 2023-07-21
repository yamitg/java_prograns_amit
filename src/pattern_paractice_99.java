public class pattern_paractice_99
{
    public static void main(String[] args)
    {
        int n=7;
        for (int i=0;i<n;i++)
        {
            for (int j=4;j>i;j--)
            {
                System.out.print ("  ");
            }
            for (int k=i;k<=i;k++)
            {
                System.out.print("* ");
            }
            for (int a=0;a<=i;a++)
            {
                System.out.print("   ");
            }
            for (int u=1;u<=i;i++)
            {
                System.out.print("* ");
            }
            System.out.print("\n\n");
        }

    }
}
