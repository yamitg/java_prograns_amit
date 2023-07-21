package programs_list;

import java.util.Scanner;

public class program_25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:=");
        int n = sc.nextInt();
        int rem;
        int count=0;
        int i=0;
        while (n>0)
        {
            rem=n%10;
            if (rem>0)
            {
                count++;
            }
            n=n/10;
            i++;

        }
        System.out.println(count+" , ");
    }
}
