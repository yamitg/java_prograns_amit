package daily_5_program_Register.date_24_06_23;

import java.util.Scanner;

public class fabonacci_series
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the range of Fabonacci Series:=");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("fabonacci Series:= ");
        for (int i=0;i<=n;i++)
        {
            while(a<50)         //  to run up to 50
            {
                System.out.print(a + ", ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
