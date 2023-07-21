package programs_list;

public class factorial__num
{
    public static void main(String[] args)
    {
        int n = 987654321;
        while (n > 0)
        {
            int rem = n % 10;
            if (rem % 2 == 0)
            {
                System.out.print(rem + ":= " );
                for (int i = 1; i <= rem; i++)
                {
                    if (rem % i == 0)
                    {
                        System.out.print(i + ", ");
                    }
                }
                System.out.println(" ");
            }
            n = n / 10;
        }
    }
}