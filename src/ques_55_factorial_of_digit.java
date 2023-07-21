import java.util.Scanner;

public class ques_55_factorial_of_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:=");
        int n=sc.nextInt();
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
            n=n/10;
            System.out.println(rem+"!="+fact);
        }

    }
}
