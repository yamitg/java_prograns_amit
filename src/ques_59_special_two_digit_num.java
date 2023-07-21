import java.util.Scanner;

public class ques_59_special_two_digit_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:=");
        int n=sc.nextInt();
        int c=n;
        int rem=0;
        int sum=0;
        int mul=1;

            for (int i = 1; i<=n;i++)
            {
                rem = n % 10;
                sum = sum + rem;
                mul = mul * rem;
                n = n / 10;
            }


        System.out.println("Sum Of two Digits:="+sum);
        System.out.println("Multiple Of two Digits:="+mul);

        int resultant=sum+mul;
        System.out.println("Resultant:="+resultant);
        if (resultant==c)
        {
            System.out.println("It is a Special Number:="+c);
        }
        else
        {
            System.out.println("It is not a Special Number:="+c);
        }

    }
}
