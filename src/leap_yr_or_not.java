//     Question:= User input the year is leap or not
//      Answer:=

import java.util.Scanner;

public class leap_yr_or_not
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year:=");
        int a= sc.nextInt();

        if (a%100==0)
        {
            if (a%400==0)
            {
                System.out.println("This is leap year:=");
            }
            else
            {
                System.out.println("This is not a leap year:=");
            }

        }
        else
        {
            if (a%4 == 0)
            {
                System.out.println("This is leap year:=");
            } else
            {
                System.out.println("This is not leap year:=");
            }
        }
    }
}
