import java.util.Scanner;

public class practice_programs_01
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:=");
        int n =sc.nextInt();
        int i=1;
        int rem=0;

        while (i<=n)
        {
            int fact=1;
            int j=1;
            rem=n%10;
            while (j<=rem)
            {
                fact=fact*j;
                j++;
            }
            System.out.println(rem+"!="+fact);
            n=n/10;
        }

    }
}
