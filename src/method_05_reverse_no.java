import java.util.Scanner;

public class method_05_reverse_no
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:=");
        int n=sc.nextInt();
        reverse(n);

    }

    public static void reverse(int n)
    {
        int rev=0;
        int rem=0;

        for (int i=0;i<=n;i++)
        {
            rem=n%10;
            rev = rev * 10 + rem;
            n=n/10;
        }
        System.out.println("After Reversing The Number:="+rev);

    }
}
