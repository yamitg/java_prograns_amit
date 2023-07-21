import java.io.StringBufferInputStream;
import java.util.Scanner;

public class jspiderWork
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number:=");
//            int n= sc.nextInt();
//
//            String a=(n%2==0?"Number a Even":"Number is odd");
//            System.out.println(a);


//            String b="My name is amit kuamr yadav and i am studing in jspider noida.";
//            System.out.println(b.length());
//
//            for(int i=0; i<b.length();i++)
//            System.out.println(b.charAt(i));


//            String w="programming";
//            StringBuffer q= new StringBuffer("My name is Amit kumar");
//            System.out.println(q.reverse());
//            System.out.println(q.length());
//            System.out.println(w.replace('g','s'));
//            System.out.println(q.equals(w));

//        int age;
//        System.out.println("Enter your age:=");
//        age = sc.nextInt();

//            switch (age)
//            {
//                case 18:
//                    System.out.println("adult");
//                    break;
//                case 24:
//                    System.out.println("job man");
//                    break;
//                case 30:
//                    System.out.println("famly man");
//                    break;
//                case 60:
//                    System.out.println("retaired man");
//                    break;
//                default:
//                    System.out.println("Enjoy your life");
//            }

//
//        byte m1, m2, m3;
//        System.out.println("Marks in mathmatics:=");
//        m1 = sc.nextByte();
//        System.out.println("Marks in Chemsitry:=");
//        m2 = sc.nextByte();
//        System.out.println("Marks in Physics:=");
//        m3 = sc.nextByte();
//        Float avg = (m1 + m2 + m3) / 3.0f;
//        System.out.println("Your overall percentage is:="+avg);
//        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
//        {
//            System.out.println("Congrualations u have promoted");
//        }
//        else{
//            System.out.println("u r not promoted");
//        }

        System.out.println("enter the 1st  number:=");
        int a= sc.nextInt();
        System.out.println("enter the 2nd number:=");
        int b=sc.nextInt();

        int x= a>b?a:b;
        int y= a<b?a:b;
        System.out.println("the bigger is:="+x);
        System.out.println("the Smaller is:="+y);



    }

}