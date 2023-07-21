import java.util.Scanner;

public class power_of_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base A:=");
        int a=sc.nextInt();
        System.out.print("Enter the power  B:=");
        int b=sc.nextInt();
        int pow=1;
        for (int i=1; i<=b; i++)
        {
            pow=pow*a;
        }
        System.out.print("B is power of A:= "+pow);


    }
}
