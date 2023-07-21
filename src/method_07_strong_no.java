import java.util.Scanner;

public class method_07_strong_no
{
        static int count=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range up to print:=");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            strongno(i);
        }
        System.out.println(strongno(n));
    }

    public static int strongno(int i)
    {

        int com=i;
        int sum=0;
//        System.out.println("Strong Numbers Are :=");
        while (i>0)
        {
            int rem = 0;
            int fact = 1;
            rem = i % 10;
            for (int j = 1; j <= rem; j++)
            {
                fact = fact * j;
            }
//            System.out.println("Factorial of " + rem + "! :=" + fact);
            sum = sum +fact;
            i = i / 10;
        }
        if (com == sum)
        {
            System.out.print(com+" , ");
          count++;
        }
       return count;
    }


}
