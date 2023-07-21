package practice_package_java;

public class fabonicci_series
{
    public static void main(String[] args)
    {
        int n=10;
        int a=0;
        int b=1;
        System.out.print("Fabonacci Series up to:= ");
        for (int i=0;i<=n;i++)
        {
            System.out.print(a+", ");
            int c=a+b;
            a=b;
            b=c;
        }

    }
}
