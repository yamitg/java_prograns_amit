import java.util.Scanner;

public class method_04$01_primeno
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The range:=");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++)
        {
            prime(i);
        }
    }
    public static void prime(int i)
    {

        int total = 0;
        System.out.print("It is a Prime Number:=");

        {
            int count = 0;
            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }

            }
            if (count == 0)
            {
                System.out.print(i + " , ");
                total++;
            }
        }
        System.out.println( );
//        System.out.println("Total Prime number upto"+ n+":="+total);
    }

}

