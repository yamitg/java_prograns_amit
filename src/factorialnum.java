import java.util.Scanner;

public class factorialnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


//          Question: 2= W.A.J.P to print of factorial up to 15!.
//          Answer:=

//        int j=1;
//
//            while (j<=15)
//            {
//                int i = 1;
//                int fact = 1;
//                int n=j;
//
//                while (i <= n)
//                    {
//                        fact = fact * i;
//                        i++;
//                    }
//                System.out.println(n+"!="+fact);
//                j++;
//            }

//          Question: 2= W.A.J.P to print of factorial of each digit of a number enter.
//          Answer:=

                System.out.println("Enter a Factorial number:=");
                int n=sc.nextInt();
                int i=1;
                int rem=0;
                int sum=0;
                while (i<=n)
                {
                    rem=n%10;
                    int j=1;
                    int fact=1;
                    while (j<=rem)
                    {
                        fact=fact*j;
                        j++;
                    }
                    System.out.println(rem+"!="+fact);
                    sum=sum+fact;

//                    i++;
                    n=n/10;

                }
//        System.out.println("Sum of all factorial:="+sum);



//        System.out.println("Enter a Factorial number:=");
//        int n=sc.nextInt();
//        int i=1;
//        int rem=0;
//        while (i<=n)
//
//        {
//            int j=1;
//            rem=n%10;
//            int fact=1;
//            while (j<=rem)
//            {
//                fact=fact*j;
//                j++;
//            }
//            System.out.println(rem+"!:="+fact);
//            n=n/10;
//        }


//        int n=0;
//        int sum =0;
//        do
//        {
//         sum =sum+n;
//            System.out.println("Enter the number:=");
//            n=sc.nextInt();
//
//        } while (n>=0);
//        System.out.println("the sum is :="+sum);







    }
}
