import java.util.Scanner;

public class method_part_03
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Range:=");
        int m=sc.nextInt();
        for (int j=1; j<=m;j++)
        {
            factorial(j);
        }
    }

    public static void factorial(int n)
    {
        int fact=1;

        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(n+"!="+fact);

    }

}
