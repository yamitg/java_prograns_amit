import java.util.Scanner;

public class factor_of_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table number:=");
        int n =sc.nextInt();
        int fact=1;
//
        for (int j=1; j<=n;j++)
        {
            System.out.print("Factor of "+j+" is :");
            for (int i = 1; i <= j; i++)
            {
                if (j % i == 0)
                {
                    System.out.print(i+" , ");
                }
            }
            System.out.println();
        }

    }
}
