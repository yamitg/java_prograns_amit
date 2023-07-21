import java.util.Scanner;

public class method_comineall
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number:=");
        int n=sc.nextInt();

        if (find_sum(n)==n)
        {
            System.out.println("This is a Strong NUmber:= "+n);
        }
        else
        {
            System.out.println("This is not a Strong Number:="+n);
        }
    }

    public static int find_sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;
        }
        System.out.println("total sum:="+sum);
        return sum;
    }

    public static int factorial(int rem)
    {
        int fact=1;
            for (int i = 1; i <= rem; i++)
            {
                fact = fact * i;
            }
        System.out.println(rem+"! :="+fact);
            return fact;
    }
}
