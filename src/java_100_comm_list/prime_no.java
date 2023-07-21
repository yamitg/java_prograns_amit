package java_100_comm_list;

import java.util.Scanner;

public class prime_no
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Range:=");
        int n =sc.nextInt();
        int total=0;
        System.out.println("Enter number is prime number:=");
        for (int j=2;j<=n;j++)
        {
            int count=0;
            for (int i = 2; i <=j / 2; i++)
            {
                if (j % i == 0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                total++;
                System.out.println(j+" , ");
            }
//            else
//            {
//                System.out.println("Enter Number is not Prime:="+n);
//            }
        }
        System.out.println("Total number up-to "+n+" is:="+total);

    }
}
