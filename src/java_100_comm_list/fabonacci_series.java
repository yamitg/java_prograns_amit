package java_100_comm_list;

import java.util.Scanner;

public class fabonacci_series
{
    public static void main(String[] args)
    {
//        0,1,1,2,3,5,8,13,21,34..........
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range:=");
        int n =sc.nextInt();
        System.out.print("Fabonacci Series is:=");
        int c;
        int a=0;
        int b=1;
        while(a<=n)
        {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
