package daily_5_program_Register.date_24_06_23;

import java.util.Scanner;

public class armstrongUpt0_500
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:=");
        int n = sc.nextInt();
        System.out.print(" Armstrong Numbers Up to "+n+" :=" );
        for (int j = 1; j <= n; j++)
        {
            int sum = 0;
            int c = j;
            while (c > 0)
            {
                int rem = c % 10;
                int num_pro = 1;
                for (int i = 0; i < 3; i++)
                {
                    num_pro = num_pro * rem;
                }
                sum = sum + num_pro;
                c = c / 10;
            }
            if (sum == j)
            {
                System.out.print(j+", ");
            }
        }
    }



}
