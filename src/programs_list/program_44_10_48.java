package programs_list;

import java.util.Scanner;

public class program_44_10_48
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :=");
        int n = sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        while(n>0)
        {
            int rem=0;
            int fact=1;
            rem=n%10;
            if (rem%2==0)
            {
                System.out.print("factorial of Even digit "+rem+"! is:");
                for (int i=1;i<=rem;i++)
                {
                    fact=fact*i;
                }
                sum_even=sum_even+fact;
                System.out.println(fact+", ");
                System.out.println("Sum of all even factorial is :="+sum_even);
            }
            else
            {
                System.out.print("factorial of odd digit "+rem+"! is:");
                for (int i=1;i<=rem;i++)
                {
                    fact=fact*i;
                }
                sum_odd=sum_odd+fact;
                System.out.println(fact+", ");
                System.out.println("Sum of all odd factorial is :="+sum_odd);
            }
            n=n/10;

        }


    }

}
