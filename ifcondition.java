// Baisc condtion:- if
//question:- write a program a candidate a program to given a vote :

import java.util.Scanner;
public class ifcondition
{
    public static void main(String[] args)
    {

//        Ques:1 If condition elligible for vote.
//          Answer:
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the candidate age:=");
//        int age = sc.nextInt();
//        if (age >= 18)
//        {
//            System.out.println("elligible for vote:=");
//        }
//            else
//        {
//            System.out.println("not elligible for  vote:");
//        }


//        ques: Condition with if pass or fail.
//        Answer:

//        System.out.println("enter the number:=");
//        int pass = sc.nextInt();
//        if (pass >= 350)
//        {
//            System.out.println("pass");
//        }
//        else
//        {
//            System.out.println("fail");
//        }


//       Ques: 2 write a program to print the value is odd or even;
//        Answer:
//        System.out.println("enter the number for even & odd:=");
//        int a = sc.nextInt();
//        if (a % 2 == 0)
//        {
//            System.out.println("even");
//        }
//        else
//        {
//            System.out.println("odd");
//        }




//        Ques:3 Take two interger value print which value is bigger
//         Answer:
//
//        int a = 10;
//        int b = 20;
//        if (a < b)
//        {
//            System.out.println("number is bigger");
//        } else
//        {
//            System.out.println("number is lesser");
//        }
//
//      ques:4 now three condition we  have
//            marks=340
//            marks<340----pass
//            marks<540----average
//            marks<940----excellent
//       answer:-
        System.out.println("enter the number:=");
        int marks = sc.nextInt();
        if (marks < 340)
        {
            System.out.println("fail");

        }
        else if (marks < 540)
        {
            System.out.println("pass");

        }
        else if (marks < 940)
        {
            System.out.println("Average");

        }
        else
        {
            System.out.println("excellent");
        }


        }

    }

