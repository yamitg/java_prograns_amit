import java.util.Scanner;
public class j_14programs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


//        Question=2 : W.A.J.P tp find biggest of four number by using else if Statement .
//        Answer:=
//
//        System.out.print("Enter the Number a:=");
//        int a= sc.nextInt();
//        System.out.print("Enter the Number b:=");
//        int b= sc.nextInt();
//        System.out.print("Enter the Number c:=");
//        int c= sc.nextInt();
//        System.out.print("Enter the Number d:=");
//        int d= sc.nextInt();
//
//        if (a>b)
//        {
//            System.out.println(" A is Greatest Number:="+a);
//        }
//        else if (b>c)
//        {
//            System.out.println(" B is Greatest Number:="+b);
//        }
//        else if (c>d)
//        {
//            System.out.println(" C is Greatest Number:="+c);
//        }
//        else
//        {
//            System.out.println(" D is Greatest Number:="+d);
//        }
//        System.out.println(" Thank-you Program Ends !!!");


//        Question=3 : W.A.J.P that takes a year from user and print whether that year is a leap year or not
//        by using else if Statement .
//        Answer:=

//        System.out.println("Enter the Year:=");
//        int a= sc.nextInt();
//        if ((a%100!=0 && a%4==0)||(a%400==0))
//        {
//            System.out.println("This is a Leap Year");
//        }
//        else
//        {
//            System.out.println("This is not a Leap Year");
//        }

//        Question=4 : W.A.J.P that takes a Character as user input and check whether the Character is an
//        alphabet or not by using else if Statement .
//        Answer:=

//            System.out.print("Enter a Character:=");
//            char ch=sc.next().charAt(0);
//
//            if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
//            {
//                System.out.print("The Character Is Alphabet:");
//            }
//            else
//            {
//                System.out.println("Enter Value is not Alphabet:");
//            }


//        Question=5 : W.A.J.P that takes a Character as user input and check whether a enters Character is lowercase(a to z)
//        or uppercase(A to Z) by using else if Statement .
//        Answer:=

//            System.out.print("Enter a Character:=");
//            char ch=sc.next().charAt(0);
//
//            if (ch>='A' && ch<='Z')
//            {
//                System.out.print(" The Character is In UPPERCASE:");
//            }
//            else if (ch>='a' && ch<='z')
//            {
//                System.out.println("Enter Value is In Lowercase:");
//            }
//            else
//            {
//                System.out.println("Enter the value is not Alphabet ");
//            }


//        Question=6 : W.A.J.P to check whether a number is divisible by 5 and 11 or not .
//         by using else if Statement .
//        Answer:=

//            System.out.print("Enter the number:=");
//            int a=sc.nextInt();
//
//            if (a%5==0 && a%11==0)
//            {
//                System.out.println(" Number Is divisible by 5 and 11");
//            }
//            else
//            {
//                System.out.println(" Number is not Divisible by 5 and 11");
//            }

//        Question=7 : W.A.J.P to input any Alphabet and check whether it is vowel or consonant.
//         by using else if Statement .
//        Answer:=

//            System.out.print("Enter the Character:=");
//            char ch=sc.next().charAt(0);
//            if (ch=='a' || ch=='A' || ch=='e'  || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
//
//            {
//                System.out.print("This Character is Vowel:="+ch);
//            }
//            else if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
//            {
//                System.out.print("This Character is consonant:="+ch);
//            }
//            else
//            {
//                System.out.println("Enter Value is not Alphabet");
//            }

//         Question=8 : W.A.J.P to input any character and check whether it is alphabet, digit or special character.
//         by using else if Statement .
//        Answer:=

//            System.out.print("Enter the Value:=");
//            char ch=sc.next().charAt(0);
//             if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
//             {
//                 System.out.println("This Is Alphabet:="+ch);
//             }
//             else if (ch>='0' && ch<='9')
//             {
//                 System.out.println("This is Digit:="+ch);
//             }
//             else
//             {
//                 System.out.println("Special Character:="+ch);
//             }


//         Question=9 : W.A.J.P to check whether a character is uppercase or lowercase alphabet.
//         by using else if Statement .
//        Answer:= Same as Question no.= 5

//        Question=10 : W.A.J.P to input  all sides of a triangle and check whether triangle is valid or not.
//         by using else if Statement .
//        Answer:=
//             System.out.print("Enter the 1st Side a:=");
//             int a=sc.nextInt();
//             System.out.print("Enter the 2nd Side b:=");
//             int b=sc.nextInt();
//             System.out.print("Enter the 3rd Side c:=");
//             int c=sc.nextInt();
//
//             if (a+b>c && b+c>a && a+c>b)
//             {
//                 System.out.println("Triangle is Possible (Valid)");
//             }
//             else
//             {
//                 System.out.println("Triangle is Not Possible (Value)");
//             }


//        Question=11 : W.A.J.P to input angles of a triangle and check whether triangle is valid or not.
//         by using else if Statement .
//        Answer:=
//             System.out.print("Enter the 1st Angle a:=");
//             int a=sc.nextInt();
//             System.out.print("Enter the 2nd Angle b:=");
//             int b=sc.nextInt();
//             System.out.print("Enter the 3rd Angle c:=");
//             int c=sc.nextInt();
//             int sum=a+b+c;
//             System.out.println("Sum of All Angle's:="+sum);
//
//             if (a+b+c==180)
//             {
//                 System.out.println("Triangle is Possible (Valid)");
//             }
//             else
//             {
//                 System.out.println("Triangle is Not Possible (Value)");
//             }




//        Question=12 : W.A.J.P to check whether the triangle is equilateral, isosceles or scalene triangle.
//         by using else if Statement .
//        Answer:=

//             System.out.print("Enter the 1st Angle a:=");
//             int a=sc.nextInt();
//             System.out.print("Enter the 2nd Angle b:=");
//             int b=sc.nextInt();
//             System.out.print("Enter the 3rd Angle c:=");
//             int c=sc.nextInt();
//
//             if (a==b && b==c)
//             {
//                 System.out.println("It is a Equilateral Triangle");
//             } else if (a==b || b==c ||c==a)
//             {
//                 System.out.println("It is a Isosceles Triangle");
//
//             }
//             else if (a!=b && b!=c && c!=a)
//             {
//                 System.out.println("It is a Scalene Triangle");
//             }



//        Question=13 : W.A.J.P to find real roots of a quadratic equation.
//         by using else if Statement .
//        Answer:=13

//            System.out.print("Enter the Value of a:=");
//            int a=sc.nextInt();
//            System.out.print("Enter the Value of b:=");
//            int b=sc.nextInt();
//            System.out.print("Enter the Value of c:=");
//            int c=sc.nextInt();
//            int d=b*b-4*a*c;
//            if (d>=0)
//            {
//                System.out.println("Roots are Real");
//                double p=(-b+ Math.sqrt(d)/(2*a));
//                double q=(-b- Math.sqrt(d)/(2*a));
//
//                System.out.println("The 1st Root is:="+p);
//                System.out.println("The 2nd Root is:="+q);
//            }
//            else
//            {
//                System.out.println("The Roots are Not Real(Imaginary Roots");
//            }
//
//                System.out.println("A Quadratic Program Has been Completed. HAve A Nice Day !!!");

//        Question=14 : W.A.J.P to  calculate %profit or %loss after taking cost price and selling price as user input.
//         by using else if Statement .
//        Answer:= 14
//            System.out.print("Enter The Cost-price:=");
//            double cp=sc.nextDouble();
//            System.out.print("Enter The Selling-price:=");
//            double sp=sc.nextDouble();
//            double p,l;
//
//            if (sp-cp>0)
//            {
//                p=sp-cp;
//                System.out.println("Profit In Rupees:=" +p);
//                System.out.println("Profit In %:=" +(p/cp)*100);
//            }
//            else if (cp-sp>0)
//            {
//                l=cp-sp;
//                System.out.println("Loss In Rupees :="+l);
//                System.out.println("Loss In %:="+(l/cp)*100);
//            }
//            else
//            {
//                System.out.println("Neither Profit Nor Loss(Neutral");
//            }


//        Question=14 : W.A.J.P to Print All Even NO. Up to 100 as user input.
//         by using else if Statement .
//        Answer:=

//            System.out.print("Enter the Number:=");
//            int n=sc.nextInt();
//            int i=0;
//            while ( i<=n )
//        {
//            System.out.print(2*i+",");
//            i++;
//        }
//        System.out.println("Program Completed");

//        -------------OR another Rule to Print print Even Number----------=
//                System.out.print("Enter the Number:=");
//                int n=sc.nextInt();
//                int i=0;
//                while ( i<=n )
//                {
//                    if (i%2==0)
//                    {
//                        System.out.println(i);
//                    }
//                    i++;
//                }




//        Question=14(b) : W.A.J.P to Print All Odd NO. Up to 100 as user input.
//         by using else if Statement .
//        Answer:=

//        System.out.print("Enter the Number:=");
//        int n=sc.nextInt();
//        int i=0;
//        while ( i<=n )
//        {
//            System.out.print(2*i+1+",");
//            i++;
//        }
//        System.out.println("Program Completed");

//        -------------OR another Rule to Print All Odd Number----------=
//                System.out.print("Enter the Number:=");
//                int n=sc.nextInt();
//                int i=1;
//                while ( i<=n )
//                {
//                    if (i%2!=0)
//                    {
//                        System.out.println(i);
//                    }
//                    i++;
//                }

//        Question=16 : W.A.J.P to Print All The number which is divisible by=7, Up to 150 as user input.
//        Answer:=
//                System.out.print("Enter the Number Up to find:=");
//                int n=sc.nextInt();
//                int i=1;
//
//                while (i<=n)
//                {
//                                                                  System.out.print(7*i+","); //Another Rule To print.
//                                                                  i++;
//                    if (i%7==0)
//                    {
//                        System.out.print(i+",");
//                    }
//                    i++;
//                }


//            Question=17 : W.A.J.P to Count all the number divisible by 18 up to 250 as user input.
//            Answer:=

//                System.out.print("Enter the Number Up to find:=");
//                int n=sc.nextInt();
//                int i=1;
//                int count=0;
//
//                while (i<=n)
//                {
//                    if (i%18==0)
//                    {
//                        System.out.print(i+",");
//                       count++;
//                    }i++;
//                }
//                System.out.println("All the number divisible by 18 up to 250 is :="+count);


//            Question=18 : W.A.J.P to Print all the number up to 1000 ,which are divisible by 7 and also ends with 7
//            as user input.
//            Answer:=

//                System.out.print("Enter the Number Up to find:=");
//                int n=sc.nextInt();
//                int i=1;
//
//                while (i<=n)
//                {
//                    if (i%7==0 && i%10==7)
//                    {
//                        System.out.println(" A number Which is divisible by 7 and ends with 7:="+i+",");
//                    }i++;
//                }


//            Question=19 : W.A.J.P to count how many numbers are divisible by 17 up to 1000. Take user input print
//                            factorial of the number .
//            Answer:=

//                    System.out.println("Enter the Value up to :=");
//                    int n = sc.nextInt();
//                    int i=1;
//                    int count=0;
//
//                    int a=17;
//                    while (i<=n)
//                    {
//
//                        if (i%a==0 )
//                        {
//                        count++;
//                            long fact=1;
//                            while(i>0)
//                            {
//                                fact=fact*i;
//                                i--;
//                            }
//                            System.out.println(fact);
//                        }
//
//
//
//                        i++;
//                    }
//
//                        //System.out.println("Factorial of "+a+"! :="+fact);
//                        System.out.println("All the number divisible by 17 up to 1000 is :="+count);

//             Question=19 : W.A.J.P take two inputs from user a and b and print power of a and b .
//            Answer:=

//                System.out.print("Enter the value of a:=");
//                int a=sc.nextInt();
//                System.out.print("Enter the value of b:=");
//                int b=sc.nextInt();
//                int result=1;
//                int i=1;
//
//                while (i<=b)
//                {
//                    result=result*a;
//                    i++;
//                }

//                for (int i=1; i<=b;i++)
//                    {
//                            result=result*a;
//
//                    }
//                System.out.println(" a^b:="+result);

//        Question=20 : W.A.J.P Print Multiplication Table of 6 .
//          Answer:

//            System.out.print("Enter a Table number:=");
//            int num=sc.nextInt();
//            int c;
//             for (int i=1; i<=10;i++)
//                 {
//                     System.out.println(num+"*"+i+"="+num*i);
//                 }


//          Question=20 : W.A.J.P  Area of a Rectangle.
//          Answer:

//            System.out.print("Enter the value of length:=");
//            int a=sc.nextInt();
//            System.out.print("Enter the value of breadth:=");
//            int b=sc.nextInt();
//            int Area;

//            Area=a*b;
//            System.out.println("Area of a Rectangle:="+Area);


//          Question=20 : W.A.J.P Swapping Two Numbers.
//          Answer:

//            System.out.print("Enter the value of a:=");
//            int a=sc.nextInt();  //10
//            System.out.print("Enter the value of b:=");
//            int b=sc.nextInt();   //20
//            int temp;
//            System.out.println("Before Swapping :a="+a+" , "+"b="+b);
//            temp=a;
//            a=b;
//            b=temp;
//            System.out.println("After Swapping :a="+a+" , "+"b="+b);


//        Question=20(b) : W.A.J.P Swapping of three Numbers.
//        Answer:

//            System.out.print("Enter the value of a:=");
//            int a=sc.nextInt();  //10
//            System.out.print("Enter the value of b:=");
//            int b=sc.nextInt();   //20
//            System.out.print("Enter the value of c:=");
//            int c=sc.nextInt();   //30
//            int temp;
//            System.out.println("Before Swapping :a="+a+" , "+"b="+b+" , "+"c="+c);
//            temp=a;
//            b=a+b;
//            c=temp;
//            a=b-c;
//            System.out.println("After Swapping :a="+a+" , "+"b="+b+" , "+"c="+c);




//            Question=20(b) : W.A.J.P sum of the Natural Number Up to 100.
//            Answer:

//                System.out.print("Enter the value up to sum=");
//                int n=sc.nextInt();
//                int sum;
//                sum=n*(n+1)/2;
//                System.out.println(sum);

//                for (int i=1;i<=n;i++)
//                {
//                    sum=sum+i;
//                    System.out.println(sum);
//                }



//            Question=20(b) : W.A.J.P Sum Of Digit of a number entered by user.
//            Answer:

//                System.out.print("Enter the Number=");
//                int n=sc.nextInt();
//                int a,sum=0;
//
//                while (n>0)
//                {
//                    a=n%10;
//                    sum=sum+a;
//                    n=n/10;
//                    System.out.println("Sum of Digits:="+sum);
//                }



//       Question=20(b) : W.A.J.P How many Digits in a number entered by user.
//       Answer:
//        System.out.print("Enter A Number:=");
//        int n =sc.nextInt();
//        int i=0;
//        int count=0;
//        int r;
//        while(n>0)
//        {
//            n=n/10;
//            System.out.println(n);
//            count++;
//
//        }
//
//        System.out.println("Total Number of Digits:="+count);



//       Question=20(b) : W.A.J.P Print All the Prime Number in a range up to 100.
//       Answer:
//        System.out.print("Enter A Number:=");
//        int n =sc.nextInt();
//        int i=1;
//        int count=0;
//
//        while (i<=n)
//        {
//            if (n%i==0)
//            {
//
//                System.out.print(i+" , ");
//                count++;
//            }
//            i++;
//
//        }
//
//        if (count==2)
//        {
//            System.out.println("It is Prime NUmber");
//        }
//        else
//        {
//            System.out.println("It is not Prime NUmber");
//        }


//       Question=21 : W.A.J.P  Factorial of a Number.
//       Answer:
//        System.out.print("Enter a Factorial Number:=");
//        int n=sc.nextInt();
//        int i=1;
//        int fact=1;
//
//        while (i<=n)
//        {
//            fact=fact*i;
//            i++;
//        }
//
//        System.out.println(n+"!="+fact);




//    Question=21(a) : W.A.J.P  Factor of a Number.
//    Answer:
//    System.out.print("Enter a Factorial Number:=");
//    int n=sc.nextInt();
//        int i=1;
//        while (i<=n)
//
//        {
//
//                    int j=1;
//                    int fact=1;
//
//                    while (j<=i)
//                    {
//                        fact=fact*j;
//                        j++;
//
//                    }
//
//            System.out.println(i+"!="+fact);
//            i++;
//
//        }



//    Question=21(a) : W.A.J.P  Factor of a Number of each digit.
//    Answer:
//            System.out.print("Enter a Number:=");
//            int n=sc.nextInt();
//            int rem;
//            while(n>0)
//            {
//                rem = n % 10;
//                int fact = 1;
//                int i=1;
//                while (i <= rem)
//                {
//                    fact=fact*i;
//                    i++;
//                }
//                System.out.println(rem+"!="+fact);
//                    n=n/10;
//            }



//    Question=22 : W.A.J.P  Factor of a Number of each digit.
//    Answer:

        System.out.print("Enter a Number:=");
        int x=sc.nextInt();
        int a=1;
        int count = 0;
        while(a<=x)
        {
            int i = 1;
            int n = x;

            while (i <= n)
            {
                if (n % i == 0)
                {
                    count++;

                }
                i++;

            }a++;
        }
        System.out.println(count);

        if (count==2)
        {
            System.out.println("It is Prime NUmber");
        }
        else
        {
            System.out.println("It is not Prime NUmber");
        }


//      Question: 2= W.A.J.P to Check Whether a number is strong Number or not .
//      Answer:=
//        System.out.println("Enter A number:=");
//        int n=sc.nextInt();
//        int i=1;
//        int fact=1;
//        int rem=0;
//        while (i<=n)
//        {
//            rem=n%10;
//            while (i<=rem)
//            {
//                fact = fact * i;
//                System.out.println(fact);
//                i++;
//            }n=n/10;
//        }


//        int n=5;
//        int multi=1;
//        for (int i=1;i<=10;i++)
//        {
//         multi=n*i;
////            System.out.println(n+"X"+i+"="+multi);
//            System.out.printf("%d X %d = %d\n",n ,i , multi);
//        }



    }

}
