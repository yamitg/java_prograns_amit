package daily_5_program_Register.date_24_06_23;

import java.sql.SQLOutput;
import java.util.Scanner;

public class factorial_upto_50
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tHe range of palindrome:= ");
        int n=sc.nextInt();
        for (int j=1;j<=n;j++)
        {
            int fact = 1;
            System.out.print("Factorial of "+j+"! := ");
            for (int i = 1; i <= j; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
