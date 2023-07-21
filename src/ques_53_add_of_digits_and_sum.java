import java.util.Scanner;

public class ques_53_add_of_digits_and_sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:=");
        int n=sc.nextInt();
        int i=1;
        int add=0;
        int rem=0;
        System.out.print("Reminder:=");
        while (n>0)
        {
            rem=n%10;
            add=add+rem;
            System.out.print(rem+"+");
            n=n/10;
            i++;
        }
        System.out.println( );
        System.out.println("Addition of all The Digits:="+add);
    }
}
