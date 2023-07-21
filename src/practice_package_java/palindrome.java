package practice_package_java;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:= ");
        int n =sc.nextInt();
        System.out.print("Plandrome Numbers are : =");

        for (int i=1;i<=n;i++)
        {
            int c=i;
            int rem = 0;
            int rev = 0;

            while (c > 0)
            {
                rem = c % 10;
                rev = rev * 10 + rem;
                c = c / 10;
            }
            if (rev == i)
            {
                System.out.println(rev+", ");
            }
//            else
//            {
//                System.out.print("Enter NUmber is not a plaindrome number: =" + c);
//            }
        }

    }
}
