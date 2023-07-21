import java.util.Scanner;

public class method_part_02
{
    public static void main(String[] args)
    {
        System.out.println("This is the main method .");
        factorial(5);
        factorial(6);
        factorial(15);
    }

    public static void factorial(int n)
    {
//        int n=5;
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(n+"!="+fact);
    }
}
