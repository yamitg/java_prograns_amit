//      Question 1.:= WRJA to Calculate Percentage with user input .
//        Answer:=

import java.util.Scanner;
public class if_else_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the marks of Mathsmatics:=");
//        int a = sc.nextInt();
//        System.out.print("Enter the marks of Science:=");
//        int b = sc.nextInt();
//        System.out.print("Enter the marks of English:=");
//        int c = sc.nextInt();
//        System.out.print("Enter the marks of Social Science:=");
//        int d = sc.nextInt();
//        System.out.print("Enter the marks of Hindi:=");
//        int e = sc.nextInt();
//
//        int obt = a + b + c + d + e;
//        System.out.println("Total Marks:=" + obt);
//        float percentage = ((obt * 100) / 500);
//        System.out.println("Percentage:=" + percentage);
//        if (percentage>=90)
//        {
//            System.out.println("You Got Grade:= A++");
//        }
//        else if (percentage>75)
//        {
//            System.out.println("You Got Grade:= A+");
//        } else if (percentage>60)
//        {
//            System.out.println("You Got Grade:= A");
//        }
//        else if (percentage>45)
//        {
//            System.out.println("You Got Grade:= B");
//        } else if (percentage>=33)
//        {
//            System.out.println("you got Grade:= C");
//        }
//        else
//        {
//            System.out.println("You Got Grade:= D(Fail)");
//            System.out.println("I think you must Try Harder !!!");
//        }

//     Question:= User input the year is leap or not( Using if and else only Condition).
//      Answer:=
        System.out.print("Enter the year:=");
        int year= sc.nextInt();

        if ((year%100!=0 && year%4==0)||(year%400==0))
        {
            System.out.println("This year is a leap year:=");
        }
        else
        {
            System.out.println("This year is not a leap year:=");
        }


    }
}