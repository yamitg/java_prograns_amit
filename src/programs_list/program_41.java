package programs_list;

import java.util.Scanner;

public class program_41
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range :=");
        int n =sc.nextInt();
            int c = n;
            int sum = 0;
            System.out.print("factors of " + c + " are := ");
            for (int i = 1; i < n; i++)
            {
                if (n % i == 0)
                {
                    System.out.print(i + ", ");
                    sum = sum + i;
                }
            }
            System.out.println();
            if (sum == c)
            {
                System.out.println("It is perfect NUmber:=" + c);
            } else
            {
                System.out.println("It is not a perfect Number:=" + c);
            }



    }
}
