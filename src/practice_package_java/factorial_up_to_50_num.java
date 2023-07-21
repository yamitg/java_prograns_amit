package practice_package_java;

public class factorial_up_to_50_num
{
    public static void main(String[] args)
    {
        int n=10;
        for (int i=1;i<=n;i++)
        {
            int fact=1;
            System.out.print("Factorial of "+i+"! is:= ");
            for (int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            System.out.println(fact+", ");
        }
    }
}
