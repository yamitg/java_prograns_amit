package daily_5_program_Register.date_24_06_23;

import java.util.Scanner;

public class multiplication_table
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter up to Table Display :=");
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            int m=j;
            System.out.println("Multiplication table of "+m+" is:");
            for (int i = 1; i <= 10; i++)
            {
                int mul = 0;
                mul = m * i;
                System.out.println(m + " X " + i + " = " + mul);
            }
            System.out.println("==================================");
        }

    }
}
