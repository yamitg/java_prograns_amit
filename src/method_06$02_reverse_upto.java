import java.util.Scanner;

public class method_06$02_reverse_upto
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the MAXIMUN Range Number:=");
        int n = sc.nextInt();
        reverse(n);
    }

    public static void reverse(int n)
    {
        System.out.print("The Range up to " +n+ " to " +1+ " in Reverse Order:=");
        for (int i = n; i >= 1; i--)
        {
            System.out.print(i+", ");
        }
    }
}