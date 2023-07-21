import java.util.Scanner;

public class method_04_primeno
{
    public static void main(String[] args)
    {
        prime(100);
    }

    public static void prime(int n)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter The range:=");
//        int n = sc.nextInt();
        int total = 0;
        System.out.print("It is a Prime Number:=");
        for (int i = 2; i <= n; i++)
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
        System.out.println("Total Prime number upto"+ n+":="+total);
        }

    }

