package array_string_class;

public class array_21_reverse_every_elelment
{
    public static void main(String[] args)
    {
        int arr[]={23,45,61,73,89,76,54,32,25,58,69,74,53,42,31};
        System.out.print(" Every element is reversed in (Array list) is:= ");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                int rem=0;
                int rev=0;
                for (int k=0;k<arr.length;k++)
                {
                    rem = k % 10;
                    rev = rev * 10 + rem;
                    k = k / 10;
                }
                System.out.print(rev+", ");
            }
        }
    }

}

