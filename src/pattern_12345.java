public class pattern_12345
{
    public static void main(String[] args)
    {
        int n=7;
        int count=0;
        for (int i=1;i<=7;i++)
        {
            for (int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }
    }
}
