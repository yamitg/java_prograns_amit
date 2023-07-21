//          Ques:64 Fibonacci series:
//          0,1,1,2,3,5,8,13,21.......... .

import java.util.Scanner;

public class ques_64_fibonacci_series
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


//        System.out.print("Enter the Range:=");
//        int n =sc.nextInt();
        System.out.print("Fibonacci Series:=");
        int a=0;
        int b=1;
        int c;
        int sum=0;
        for (int i=1; i<=8; i++)
        {
            System.out.print(+a+" , ");
            c=a+b;
            a=b;
            b=c;
        }


    }
}
