package programs_list;

import java.util.Scanner;

public class program_29 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:=");
        int n = sc.nextInt();
        int rem = 1;
        int rev = 0;
        int i = 0;
        int c=n;
        while (n > 0)
        {
            rem = n % 10;
            if (rem >= 0)
            {
                rev = rev * 10 + rem;
            }
            n = n / 10;
            i++;
        }
        System.out.print(rev);
//        if (rev=c)/

        {
            System.out.println("Number is palindrome");
        }
//        else
        {
            System.out.println("Enter number is  not palindrome");
        }
    }
}
