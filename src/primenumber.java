import java.util.Scanner;
public class primenumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=2;
        int prcount=0;
        int sum=0;
        while (i<=100)
            {
                int j = 2;
                int count = 0;
                int n = i;
                while (j <= n/2)
                {
                    if (n % j == 0)
                        {
                            count++;
                        }
                    j++;
                }
                if (count == 0)
                    {
                        System.out.print(n+" , ");
                        sum=sum+n;

                        prcount++;
                    }
                i++;
            }
                System.out.println("Total Prime number:="+prcount);
                System.out.println("Sum of total prime number upto 100:="+sum);
        }



    }


