package java_100_comm_list;

public class in_digit_num_even_square
{
    public static void main(String[] args)
    {
        int square=1;
        int n=987654321;
        while (n>0)
        {
            int rem=n%10;
            if (rem%2==0)
            {
                square=rem*rem*rem;
                System.out.println(rem+" := "+square+", ");
            }
            n=n/10;
        }

    }
}
