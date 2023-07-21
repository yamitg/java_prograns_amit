package daily_5_program_Register.date_24_06_23;

import java.util.Scanner;

public class prime_number_upto500
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Range Of Prime Number:=");
        int n=sc.nextInt();
        System.out.print("Prime Numbers:= ");
        for (int i=0;i<=n;i++)
        {
            int count=0;
            for (int j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.print(i+", ");
            }
        }
    }
}
