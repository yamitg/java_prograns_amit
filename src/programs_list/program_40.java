package programs_list;

import java.util.Scanner;

public class program_40
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Starting Range Number :=");
        int m =sc.nextInt();
        System.out.println("Enter the Ending Range up-to Number :=");
        int n =sc.nextInt();
        System.out.print("Numbers Which are Divisible by 11:= ");
        for (int i=m;i<=n;i++)
        {
            if(i%11==0)
            {
                System.out.print(i+", ");
            }
        }

    }
}
