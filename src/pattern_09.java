public class pattern_09
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=1; i<5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=1;k++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
