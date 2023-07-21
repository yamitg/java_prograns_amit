public class pattern_abcd
{
    public static void main(String[] args)
    {
        char n='E';
        char count='A';
        for (char i='A';i<=n;i++)
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println(" ");
        }

    }
}
