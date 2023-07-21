import java.util.Scanner;

public class ques_48_sum_factorial_evendigit
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number:=");
        int n=sc.nextInt();
        int sum=0;
        for (int i =1; n>0;i++)
        {
            int rem=0;
            rem=n%10;
            if (rem%2==0)
            {
                int fact=1;

                for (int j=1; j<=rem; j++)
                {
                    fact=fact*j;
                    sum=sum+fact;
                }
                System.out.print(rem+"!="+fact+" , ");
            }
            n=n/10;
        }
        System.out.println( );
        System.out.println("Sum of even digit factorial:="+sum);

    }
}
