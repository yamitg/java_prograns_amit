import java.util.Scanner;

public class armstrong_num
{
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:=");
//        int n=sc.nextInt();
//        for (int i=0; i<n;i++)
//        {
//            count(i);
//        }
        int sum=0;
        int n=153;
        int c=n;
        count(n);
//        sum=pow*
//        if (sum=c)
        {

        }

    }

    public static int count(int n)
    {

        int sum=0;
        int rem=0;
        rem=n%10;
        int pow=rem*rem*rem;
        n=n/10;
        return pow;
    }

}
