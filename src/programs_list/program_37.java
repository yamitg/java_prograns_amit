package programs_list;

import java.util.Scanner;

public class program_37
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:=");
        int n= sc.nextInt();
        System.out.print("Divisible by 3 and 9 up-to 100:= ");
        for (int i=1;i<=n;i++)
        {
            if(i%3==0 && i%9==0)
            {
                System.out.print(i+", ");
            }
        }

    }
}
