package programs_list;

public class factorial_of_every_digit
{
    public static void main(String[] args)
    {
        int n = 987654;

        int rem = 0;
        while (n > 0)
        {
            int fact = 1;
            rem=n%10;
            for (int i = 1; i <=rem; i++)
            {
                fact = fact * i;
            }
            System.out.println(rem+" != "+fact);
            n=n/10;
        }
    }
}
