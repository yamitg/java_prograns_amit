package programs_list;

import java.util.Scanner;

public class program_42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :=");
        int n = sc.nextInt();

        for (int j = 1; j <= n; j++)
        {
            int c = j;
            int sum = 0;
//            System.out.println("factor of a number " + j + " is :=");
            for (int i = 1; i < j; i++)
            {
                if (j % i == 0)
                {
//                    System.out.println(i + ", ");
                    sum = sum + i;
                }
            }
            if (sum == c)
            {
                System.out.println("Number is perfect Number " + j + " = " + sum);
            }
//            else {
//                System.out.println("Number is not an perfect Number " + j + " = " + sum);
//            }
        }
    }
}
