import java.util.Scanner;

public class prime_factor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :=");
        int n=sc.nextInt();
        System.out.print("Prime Number:=");
        for (int i=2;i<=n;i++)
        {
            int count=0;
//            System.out.print("Factor of "+i+" is :");

            for (int j=2; j<=i/2 ;j++)
            {
                if (i%j==0)
                {
                count++;
//                System.out.println(j );
                }
            }
            if (count==0)
            {
                System.out.print(i+" , ");
            }
        }
    }
}
