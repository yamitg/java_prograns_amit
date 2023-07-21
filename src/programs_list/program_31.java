package programs_list;

import java.util.Scanner;
public class program_31
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number:=");
        int m = sc.nextInt();
        System.out.print("Enter the power number:=");
        int n = sc.nextInt();
        int pow=1;
        for (int i=0;i<n;i++)
        {
            pow=pow*m;
        }
        System.out.println(n+" power of base "+m+" are:="+pow);


    }
}
