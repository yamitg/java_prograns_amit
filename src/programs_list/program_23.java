package programs_list;

import java.util.Scanner;

public class program_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the !st number:=");
        int m = sc.nextInt();
        System.out.print("Enter the 2nd number:=");
        int n = sc.nextInt();
        System.out.println("Before swapping :-"+m+"   "+n);
        int temp;

        temp=m;
        m=n;
        n=temp;

        System.out.println("After swapping :-"+m+"   "+n);


    }
}
