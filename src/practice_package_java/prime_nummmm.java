package practice_package_java;

import java.util.Scanner;

public class prime_nummmm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:= ");
        int n =sc.nextInt();
        System.out.println("Prime number are: =");
        int total=0;
        for (int i=0;i<=n;i++)
        {
//            int c=i;
            int count=0;
            for (int j=1; j<=i ;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.println(i);
                total++;
            }
        }
        System.out.println("total:= "+total);

    }
}
