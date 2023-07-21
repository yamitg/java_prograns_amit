package programs_list;

import java.util.Scanner;

public class program_36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:=");
        int n = sc.nextInt();
        int m=10;
        System.out.print("The Numbers are Divisible by 10 up-to "+n+" :=");
        for (int i=1;i<=n;i++)
        {
           if(i%m==0)
           {
               System.out.print(i+", ");
           }
        }




    }
}
