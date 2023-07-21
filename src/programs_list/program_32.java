package programs_list;

import java.util.Scanner;

public class program_32
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:=");
        int n= sc.nextInt();
        int b=2;

        int rem;
        int j=0;
        while(n>0)
        {
            rem=n%10;
            if (rem%2==0)
            {
                int pow=1;
                for (int i=0; i<b ; i++)
                {
                    pow=pow*rem;
                }
                System.out.print(rem+" , ");
                System.out.println("Square of "+rem+" is:="+pow);
            }
            n=n/10;
            j++;
        }

    }
}
