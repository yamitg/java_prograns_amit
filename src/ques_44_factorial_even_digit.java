//        Ques. 44 Print or Calculate the Factorial of a number if in the number who digit is even:
//                number=23456

import java.util.Scanner;
public class ques_44_factorial_even_digit
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:=");
        int n =sc.nextInt();

        int j=1;
        int rem=0;
        while (j<=n)
        {
            rem=n%10;
            if (rem%2==0)
            {
                int i=1;
                int fact=1;
                while (i<=rem)
                {
                    fact = fact * i;
                    i++;
                }
                System.out.println(rem+"!="+fact);
            }
            n=n/10;
        }

    }
}
