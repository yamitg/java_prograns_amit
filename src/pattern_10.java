public class pattern_10
{
    public static void main(String[] args)
    {
        int n = 7;
        for (int i = 0; i < n; i++)
        {
            for (int k=n; k>=i; k--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        for (int i=0; i<n; i++)
        {
            for (int k=0; k<=i;k++)
            {
                System.out.print(" ");
            }
            for (int j=n; j>i;j--)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }

    }
}