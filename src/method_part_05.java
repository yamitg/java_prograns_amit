import java.util.Scanner;
public class method_part_05
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The 1st Number:=");
        int a=sc.nextInt();
        for(int j=1;j<=a;j++)
        {
            factorial(j);
        }
    }

    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(n+"! ="+fact);
        return fact;
    }
}