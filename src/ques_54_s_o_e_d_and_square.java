import java.util.Scanner;

public class ques_54_s_o_e_d_and_square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:=");
        int n = sc.nextInt();
        int sum=0;
        int rem=0;
        for (int i=1; i<=n;)
        {
            rem=n%10;
            if (rem%2==0)
            {
                sum=sum+rem;
            }
            n=n/10;
        }
        System.out.print("sum:="+sum);
        int pow=1;
        for (int j=1; j<=2; j++)
        {
            pow=pow*sum;
        }
        System.out.println( );
        System.out.println("Power of the Resulting Value(sum):= "+pow);

    }
}