public class pattern_tri
{
    public static void main(String[] args)
    {
        int n=7;
        for (int i=0;i<n;i++)
        {
            for (int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            for (int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
