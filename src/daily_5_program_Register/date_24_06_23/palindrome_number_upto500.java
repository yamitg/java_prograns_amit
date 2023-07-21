package daily_5_program_Register.date_24_06_23;

import java.util.Scanner;

public class palindrome_number_upto500
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Range Of Palindrome Number:=");
        int n=sc.nextInt();
        System.out.print("Palindrome Number up to "+n+" :=");
        int count=0;
        for (int i=1;i<=n;i++)
        {
            int rev=0;
            int c=i;
            while(c>0)
            {
                int rem = c % 10;
                rev=rev*10+rem;
                c=c/10;
            }
            if (rev==i)
            {
                System.out.print(rev+", ");
                count++;
            }
        }

        System.out.println("\nTotal Palindrome Number Up tO "+n+":= "+count);
    }
}
