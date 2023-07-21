package practice_package_java;

public class prime_number_upto_100
{
    public static void main(String[] args)
    {
        int n=100;
        System.out.print(" Prime number:= ");
        for (int i=2;i<=100;i++)
        {
            int count =0;
            for (int j=2;j<=i/2;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count==0)
            {
                System.out.print(i+", ");
            }
        }

    }
}
