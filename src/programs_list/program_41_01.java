package programs_list;

import java.util.Scanner;

public class program_41_01
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range :=");
        int n =sc.nextInt();
        for (int j=1;j<=n;j++)
        {
            int c = j;
            int sum = 0;
            System.out.println("factors of " + c + " are := ");
            for (int i = 1; i < j; i++)
            {
                if (j % i == 0)
                {
                    System.out.print(i + ", ");
                    sum = sum + i;
                }
            }

            if (sum == c)
            {
                System.out.println("It is perfect NUmber:=" + c);
            }
//            else
//            {
//                System.out.println("It is not a perfect Number:=" + c);
//            }
        }


    }
}
