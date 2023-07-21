package practice_package_java;

import java.util.Scanner;

public class arm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:= ");
        int n =sc.nextInt();
        System.out.print("Number is Armstrong Number: =");
        for (int i=0;i<=n;i++) {
            int c = i;
            int rem = 0;
            int rev = 0;
            for (int j = 0; j < 3; j++)
            {
                rem = c % 10;
                rev = rem * rem * rem + rev;
                c = c / 10;
            }
            if (rev == i)
            {
                System.out.println(rev+", ");
            }
        }
    }
}
