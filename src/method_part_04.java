import java.util.Scanner;
public class method_part_04
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The 1st Number:=");
        int a=sc.nextInt();
        System.out.println("Enter The 2nd Number:=");
        int b=sc.nextInt();
        sum(a,b);

    }

    public static void sum(int a,int b)
    {
        int add=a+b;
        if (add%2==0)
        {
            System.out.println("Even Number :="+add);
        }
        else
        {
            System.out.println("Odd number :="+add);
        }
    }


}