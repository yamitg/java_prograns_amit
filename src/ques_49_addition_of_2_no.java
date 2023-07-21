import java.util.Scanner;

public class ques_49_addition_of_2_no
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);


            System.out.print("Enter the Ist Number:=");

            int n = sc.nextInt();
            System.out.print("Enter the 2nd Number:=");
            int m = sc.nextInt();
            int sum;
            System.out.println(sum = n + m);
            if (sum % 2 == 0)
            {
                System.out.print("Sum of Two number are even:=" + sum);
            } else
            {
                System.out.print("Sum of Two number are odd:=" + sum);
            }



    }
}
