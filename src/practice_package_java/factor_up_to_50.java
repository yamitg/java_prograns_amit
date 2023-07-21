package practice_package_java;

public class factor_up_to_50
{
    public static void main(String[] args)
    {
        int n=50;
        for (int i=1;i<=n;i++)
        {
            System.out.print("Factor of "+i+" is:= ");
            for (int j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                    System.out.print(j+", ");
                }
            }
            System.out.println("");
        }

    }
}
