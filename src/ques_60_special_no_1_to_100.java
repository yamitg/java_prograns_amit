import java.util.Scanner;

public class ques_60_special_no_1_to_100
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Range:=");
        int n=sc.nextInt();
        int sum = 0;
        int mul = 1;
        int j;
        int c=0;
        for (j=10;j<=n;j++)
        {
            c = j;
            int rem = 0;
            for (int i = j; i <= j; i++)
            {
                rem = j % 10;
                sum = sum + rem;
                mul = mul * rem;
                j = j / 10;
            }

        }


        System.out.println("Sum Of two Digits:="+sum);
        System.out.println("Multiple Of two Digits:="+mul);

        int resultant=sum+mul;
        System.out.println("Resultant:="+resultant);
        if (resultant==c)
        {
            System.out.println("It is a Special Number:="+j);
        }
        else
        {
            System.out.println("It is not a Special Number:="+j);
        }

    }
}
