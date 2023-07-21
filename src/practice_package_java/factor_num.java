package practice_package_java;

import java.util.Scanner;

public class factor_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:= ");
        int n =sc.nextInt();
        for (int j=1;j<=n;j++)
        {
            System.out.print(j + "\'s factors are:= " );
            for (int i = 1; i <= j; i++)
            {
                if (j % i == 0)
                {
                    System.out.print(+ i + ", ");
                }
            }
            System.out.println("");
        }
    }
}
