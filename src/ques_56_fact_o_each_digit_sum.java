import java.util.Scanner;

public class ques_56_fact_o_each_digit_sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:=");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++)
        {
            int rem=0;
            int fact=1;
            rem=n%10;
            System.out.print("Factorial Of Each digit ");
            for (int j=1; j<=rem;j++)
            {
                fact=fact*j;

            }
            sum=sum+fact;
            n=n/10;
            System.out.println(rem+"!="+fact);
        }
        System.out.println( );
        System.out.println("Sum:="+sum);

    }
}
