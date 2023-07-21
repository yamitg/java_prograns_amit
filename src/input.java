import java.sql.SQLOutput;
import java.util.Scanner;

public class input
{ public static void main(String[] args)
{
    System.out.println("Taking input from the user:-");
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first number:-");
    int a = sc.nextInt();
    System.out.println("enter the second number:-");
    int b = sc.nextInt();
    int sum= a+b;
    System.out.println("sum of two numbers");
    System.out.println(sum);
    System.out.println("enter th third number:-");
    float c =sc.nextFloat();
    System.out.println("enter the fourth number:-");
    float d= sc.nextFloat();
    float sub = c-d;
    System.out.println(sub);
    boolean b1=sc.hasNextInt();
    System.out.println(b1);
    System.out.println("enter the 6th number:-");
    long word1= sc.nextLong();
    System.out.println("enter the 7th number:-");
    int word2 =sc.nextInt();
    long sum1=word1+word2;
    System.out.println("sum of the two 6th&7th numbers:=");
    System.out.println(sum);
    String q=sc.nextLine();
    System.out.println(q);

    System.out.println("enter the value");
    boolean o=sc.nextBoolean();


}

}