import java.util.Scanner;

public class newpractice10_03
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int n=100;
        int i=2;
        int prcount=0;
        int sum=0;

            while (i<=100)
            {
                int j=2;
                int x=i;
                int count=0;
                while (j<=x/2)
                {
                    if (x%j==0)
                    {

                        count++;
                    }
                    ;j++;
                }
                    if (count==0)
                    {
                        System.out.println("It is prime no.:="+x+" , ");
                        sum=sum+x;
                        prcount++;

                    }
                    else
                    {
                        System.out.println("It is not prime no.:="+x+" , ");
                    }
                    i++;
//                System.out.println(x+" , ");
            }
        System.out.println("Total Prime number:="+prcount);
        System.out.println("Sum of total prime number upto 100:="+sum);
    }
}
