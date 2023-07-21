import java.util.Scanner;

public class methods_basic_pro
{
    public static void main(String[] args)
    {
        System.out.println("This is the main method .");
        factorial();
    }

    public static void factorial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:=");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(n+"!="+fact);
    }
}
