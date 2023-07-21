package java_100_comm_list;

import java.util.Scanner;

public class leap_year
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Range:=");
        int n =sc.nextInt();
        if ((n%100!=0 && n%4==0) || (n%400==0))
        {
            System.out.println("Enter Number Is leap year:="+n);
        }
        else
        {
            System.out.println("Enter Number Is not an leap year:="+n);
        }
    }
}
