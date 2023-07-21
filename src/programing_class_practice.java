import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class programing_class_practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i=20;
//        int n=10;
//        while (i>=n)
//        {
//            if (i<=20)
//            {
//                System.out.println(i+" , ");
//                i--;
//            }
//        }

//


//        practice program=10

//        int i=0;
//        while (i<=100)
//        {
//            if (i%2==0)
//            {
//                System.out.println(i);
//            }
//            i++;
//            System.out.println(2*i);
//            i++;

        //        practice program=12

//            int i=1;
//            int sum=0;
//            while (i<=5)
//            {
//                sum=sum+i;
//                System.out.println(sum);
//                i++;
//            }

        //        practice program=15

//        int i=20;
//        int sum =0;
//        while (i>=10)
//        {
//            if (i%2==0)
//            {
//                System.out.print(i+" , ");
//                sum=sum+i;
//            }
//            i--;
//        }
//        System.out.println("total:="+sum);


        //        practice program=16

//        int i=35;
//        int sum=0;
//        while (i>11)
//        {
//            if (i%2!=0)
//            {
//                System.out.println(i+" , ");
//                sum=sum+i;
//            }
//            i--;
//        }
//        System.out.println("Total:="+sum);

        //        practice program=17

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int rem=0;
//        int i=0;
//        while (i<=n)
//        {
//            rem=n%10;
//            System.out.print(rem);
//            n=n/10;
//            i++;
//        }


        //        practice program=18
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int i=0;
//        int rem=0;
//        while (i<=n)
//        {
//            rem=n%10;
//            if (rem%2==0)
//            {
//                System.out.println("Even Number:="+rem);
//            }
//            n=n/10;
//            i++;
//        }

        //        practice program=20

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int i=0;
//        int rem=0;
//        int sum =0;
//        while (i<=n)
//        {
//            rem = n % 10;
//
//            System.out.println(rem);
//            sum=sum+rem;
//            n=n/10;
//            i++;
//        }
//        System.out.println("Total:="+sum);


        //        practice program=21


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int i=0;
//        int rem=0;
//        int sum =0;
//        while (i<=n)
//        {
//            rem=n%10;
//            if (rem%2==0)
//            {
//                System.out.println("Even Number:="+rem);
//                sum=sum+rem;
//            }
//            n=n/10;
//            i++;
//        }
//        System.out.println("Total:="+sum);


        //        practice program=23

//        int a=10;
//        int b=20;
//        int temp=0;
//        System.out.println("Before Swapping:"+"a="+a+","+"b="+b);
//        temp=b;  //temp=20
//        b=a;      //b=10
//        a=temp;    //a=20
//        System.out.println("After Swapping:"+"a="+a+","+"b="+b);

        //        practice program=24

//            int a=20;
//            int b=30;
//            System.out.println("Before Swapping:"+"a="+a+","+"b="+b);
//            a=a+b;    //a=50
//            b=a-b;   //b=20
//            a=a-b    //a=30
//             System.out.println("After Swapping:"+"a="+a+","+"b="+b);

        //        practice program=24


//        System.out.println("Enter a number:=");
//        int n=sc.nextInt();
//        int i=0;
//        int count=0;
//        int rem=0;
//        while (n>0)
//        {
//            rem=n%10;
//            if (rem>0)
//            {
//                count++;
//            }
//            n=n/10;
//            i++;
//        }
//        System.out.println("Total Numbers:="+count);


        //        practice program=26

//                System.out.println("Enter a number:=");
//                int n=sc.nextInt();
//                int i=0;
//                int count=0;
//                int rem=0;
//                while (i<=n)
//                {
//                    rem=n%10;
//                    if (rem%2==0)
//                    {
//                        count++;
//                    }
//                    n=n/10;
//                    i++;
//                }
//                System.out.println("Total Even Numbers:="+count);

        //        practice program=29

//                System.out.println("Enter a number:=");
//                int n=sc.nextInt();
//                int c=n;
////                int i=0;
//                int s=0;
//                int rem=0;
//                while (n>0)
//                {
////                    i=0;
//                    rem=n%10;
//                    s=(s*10)+rem;
//                    n=n/10;

//                    System.out.print(rem);
////                   i++;
//                    }
//        if (c==s)
//        {
//            System.out.println("=It is palindrome Number");
//        }
//        else
//        {
//            System.out.println(" It is not a Palindrome Number");
//        }



//                  Practice Problem=30
//                System.out.println("Enter a number:=");
//                int n=sc.nextInt();
//
//                int i=10;
//
//                while (i<=n)
//                {
//                    int c=i;
//                    int s=0;
//                    int rem=0;
//                    int j=i;
//                    while (j>0)
//                    {
//                        rem=j%10;
//                        s=(s*10)+rem;
//                        j/=10;
////                        System.out.println(rem);
//                    }
//                    if (c==s)
//                    {
//                        System.out.println(i);
//                    }
//                    i++;
//
//
//                }




//        Parctice Problem = 30

//                System.out.println("Enter a Number:=");
//                int n=sc.nextInt();
//
//                int i=10;
//                while (i<=n)
//                {
//                    int j=i;
//                    int dev=0;
//                    int c=i;
//                    int rem=0;
//                    while (j>0)
//                    {
//                        rem = j % 10;
//                        dev = dev * 10 + rem;
//                         j = j / 10;
//                    }
//                    if (c==dev)
//                    {
//                        System.out.println(i);
//                    }
//                    i++;
//
//
//
//                }



//        Practice Problem=31
//        System.out.print("Enter the Number(a):=");
//        int a=sc.nextInt();
//        System.out.print("Enter the Power of a Number(b):=");
//        int b=sc.nextInt();
//        int i=1;
//        int  num=1;
//        while (i<=b)
//        {
//            num=num*a;
//            i++;
//
//        }
//        System.out.println(" Square of a Number:="+num);

////        Practice Problem=32
//
//                System.out.print("Enter the Number(a):=");
//                 int a=sc.nextInt();
//
//                 while (a>0)
//                 {
//                     if (a%2==0)
//                     {
//                         int dig = 1;
//                         int rem = 0;
//                         while (a > 0)
//                         {
//
//                             rem = a % 10;
//                             dig = rem * rem;
//                             System.out.println("square of each digit:="+dig);
//                             a = a / 10;
//
//                         }
//
//
//                     }
//                     else
//                     {
//                         System.out.println("Digit is Odd Program ends !!!");
//                         break;
//                     }
//                 }


//        Practice Problem=35

//        System.out.print("Enter the Number(a):=");
//        int a=sc.nextInt();
//
//        while (a>0)
//        {
//            if (a%2!=0)
//            {
//                int sum=0;
//                int dig = 1;
//                int rem = 0;
//                while (a > 0)
//                {
//
//                    rem = a % 10;
//                    dig = rem * rem;
//                    System.out.println("square of each digit("+rem+"):="+dig);
//                    a = a / 10;
//                    sum =sum+dig;
//                }
//                System.out.println("Sum of cubes:="+sum);
//
//
//            }
//            else
//            {
//                System.out.println("Digit is Odd Program ends !!!");
//                break;
//            }
//        }

//         Practice Problem=36 Divisors of 10;
//        System.out.println("Enter A number:=");
//        int a = sc.nextInt();
//                int count=0;
//
//            for (int i=1; i<=500;i++)
//            {
//                if (a%i==0)
//                {
//                    count++;
//                    System.out.println("Number is divisible by"+i);
//
//                }
//            }
//                System.out.println("total:="+count);






//        palindrome number print 10 to 200;

//        System.out.println("Enter the Range:=");
//        int n = sc.nextInt();
//        int i =10;
//
//        while (i<=n)
//        {
//            int c=i;
//            int rem=0;
//            int dev=0;
//            int j=i;
//            while (j>0)
//            {
//                rem=j%10;
//                dev=dev*10+rem;
//                j=j/10;
//
//            }
//            if (c==dev)
//            {
//                System.out.println(i);
//            }
//            i++;
//
//        }


//        Armstrong Number program //--- 153= 1*1*1 +5*5*5* + 3*3*3= 153

//            System.out.println("Enter the Number:=");
//            int n = sc.nextInt();
//            int i=1;
//            int c=n;
//            int sum=0;
//            int rem=0;
//            while (i<=n)
//            {
//                rem=n%10;
//                sum=rem*rem*rem+sum;
//                n=n/10;
//            }
//            if (c==sum)
//            {
//                System.out.println("Number is armstrong ");
//
//            }
//            else
//            {
//                System.out.println("Number is not armstrong");
//            }

//       Print  Armstrong Number from 10 t0 200  //--- 153= 1*1*1 +5*5*5* + 3*3*3= 153

//        System.out.println("Enter the Range:=");
//        int n = sc.nextInt();
//        int j=10;
//        while (j<=n)
//        {
//            int i = j;
//            int c = j;
//            int sum = 0;
//            int rem = 0;
//            while (i>0)
//            {
//                rem = i % 10;
//                sum = rem * rem * rem + sum;
//                i = i / 10;
//            }
//            if (c == sum)
//            {
//                System.out.println(j);
//            }
//            j++;
//        }


//          Practice Reverse question:17

//        System.out.print("Enter A number:=");
//        int n =sc.nextInt();
//        int rem=0;
//
//        while (n>0)
//        {
//            rem=n%10;
//
//            n=n/10;
//
//        }
//        System.out.println("After reverse:="+rem);


//       Program No=40: Print Sum of the number 20 to 60 and no should be divided by 11

//            int sum=0;
//            for (int i=20; i<=60;i++)
//            {
//                if (i%11!=0)
//                {
//                    System.out.println(i);
//                    sum=sum+i;
//
//                }
//            }
//        System.out.println("Numbers are:="+sum);

//       Program No=41: Print Number is perfect number or not
//        28 : Factors of 28=1,2,4,7,14 and sum it sum=28

//        System.out.println("Enter the Number:=");
//        int n=sc.nextInt();
//        int sum=0;
//        int c=n;
//        for (int i=1; i<=n/2;i++)
//        {
//            if (n%i==0)
//            {
//                System.out.print("Factors of Number:="+i+" , ");
//                sum=sum+i;
//            }
//        }
//        System.out.println("sum"+sum);
//        if (c==sum)
//        {
//            System.out.println("Number is perfect Number:="+n);
//        }

//       Program No=42: Print Number is perfect number or not
//        28 : Factors of 28=1,2,4,7,14 and sum it sum=28

            //System.out.println("Enter the Number:=");
           // int n=sc.nextInt();
//                for(int j=1;j<=500;j++)
//                {
//                    int n=j;
//                    int sum = 0;
//                    int c = n;
//                    for (int i = 1; i <= n / 2; i++)
//                    {
//                        if (n % i == 0)
//                        {
//                           // System.out.print("Factors of Number:=" + i + " , ");
//                            sum = sum + i;
//                        }
//                    }
//                    //System.out.println("sum" + sum);
//                    if (c == sum)
//                    {
//                        System.out.println("Number is perfect Number:=" + n);
//                    }
//                }

//              Print A program of Prime Number:=

//                System.out.print("Enter A number:=");
//                int n=sc.nextInt();
//                int count=0;
//                for (int i=2; i<=n; i++)
//                {
//                    if (n%i==0)
//                    {
//                        System.out.println(i);
//                        count++;
//                        i++;
//                    }
//                }
//                if (count<=2)
//                {
//                    System.out.println("Prime Number:");
//                }
//                else
//                {
//                    System.out.println("It is not a prime number:");
//                }

//              Print A program of Prime Number up to 100 .
//        int sum=0;
//        System.out.print("prime number:=");
//        for (int j=2;j<=100;j++)
//        {
//
//            int count = 0;
//            for (int i = 1; i <= j; i++)
//            {
//                if (j % i == 0)
//                {
////                    System.out.println(i);
//                    count++;
//                }
//            }
//            if (count <= 2)
//            {
//                System.out.print(j+",");
//                sum=sum+j;
//            }
//        }
//        System.out.println("Sum of total prime numbers:="+sum);

//      Question:41 NUmber is Perfect or not:
//        153 = 1*1*1 +5*5*5 + 3*3*3 =153

//        System.out.println("Enter a number:=");
//        int n = sc.nextInt();
//        int per=0;
//        int c=n;
//        int rem =0;
//        for (int i=1; n>0; i++)
//        {
//            rem=n%10;
//            per=rem*rem*rem+per;
//            n=n/10;
//        }
//        if (c==per)
//        {
//            System.out.println("Number is perfect Number:="+per);
//        }
//        else
//        {
//            System.out.println("Enter Number is not perfect number:=");
//        }

//      Question: NUmber is Armstrong or not range up to 10 t0 200.
//        153 = 1*1*1 +5*5*5 + 3*3*3 =153

//        System.out.print("Enter a number:=");
//        int m = sc.nextInt();
//        for (int j=10;j<=m; j++)
//        {
//
//            int per = 0;
//            int c = j;
//            int rem = 0;
//            for (int i = j; i>0; )
//            {
//                rem = i % 10;
//                per = rem * rem * rem + per;
//                i = i / 10;
//            }
//            if (c == per)
//            {
//                System.out.println("Number is perfect Number:=" + per);
//            }
//        }


//            Print Factor Of A number: 28=2,4,7,14 ;

//            int n=28;
//            for (int i=1;i<=n;i++)
//            {
//                if (n%i==0)
//                {
//                    System.out.println(i);
//                    i++;
//                }
//            }

//        Ques. 43 Print or Calculate the Factorial of a number:
//
//                System.out.println("Enter a Number:=");
//                int n =sc.nextInt();
//                int fact=1;
//                int i=1;
//                while (i<=n)
//                {
//                    fact=fact*i;
//                    i++;
//                }
//                    System.out.println(n+"!:="+fact);

//        Ques. 43 Print or Calculate the Factorial of a number range 1 to 15:

//        System.out.println("Enter a Range:=");
//        int n =sc.nextInt();
//        int j=1;
//        while (j<=n)
//        {
//            int fact = 1;
//            int i = 1;
//            while (i <= j)
//            {
//                fact = fact * i;
//                i++;
//            }
//            System.out.println(j + "!:=" + fact);
//            j++;
//        }
    }
}
