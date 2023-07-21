package programs_list;

import java.util.Scanner;

public class program_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:=");
        int n = sc.nextInt();
        int rem;
        int sum=0;
        while (n > 0)
        {
            rem=n%10;
            if(rem%2!=0)
            {
                System.out.print(rem+" , ");
                sum=sum+rem;

            }
            n=n/10;
        }
        System.out.println("sum:="+sum);
    }
}
