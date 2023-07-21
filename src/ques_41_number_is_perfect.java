import java.util.Scanner;

public class ques_41_number_is_perfect
{
    public static void main(String[] args)
    {
//       Program No=42: Print Number is perfect number or not
//        28 : Factors of 28=1,2,4,7,14 and sum it sum=28
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number:=");
        int n =sc.nextInt();
        int c=n;
        int sum=0;
        int fact=1;

        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0)
            {
                System.out.println(i);
                sum=sum+i;

            }
        }
        System.out.println("sum"+sum);
        if (sum==c)
        {
            System.out.println("Number is perfect NUmber:=");
        }
        else
        {
            System.out.println("Number Is not perfect:=");
        }

    }
}
