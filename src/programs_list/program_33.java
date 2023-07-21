package programs_list;

import java.util.Scanner;

public class program_33
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:=");
        int n= sc.nextInt();
        int b=3;
        int rem;
        int j=0;

        while(n>0)
        {
            rem=n%10;
            if(rem%2!=0)
            {
                int pow=1;
                for (int i = 0; i < 3; i++)
                {
                    pow = pow * rem;
                }
                System.out.println(rem+" , ");
                System.out.println("Cube of"+rem+" is :="+pow);
            }
            n=n/10;
            j++;
        }
    }
}
