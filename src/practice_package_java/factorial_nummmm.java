package practice_package_java;

import java.util.Scanner;

public class factorial_nummmm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:= ");
        int n =sc.nextInt();
        for (int j=1;j<=n;j++)
        {
            int fact = 1;
            for (int i = 1; i <= j; i++)
            {
                fact = fact * i;
            }
            System.out.println(j+"! :="+fact);
        }
    }
}
