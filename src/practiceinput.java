import java.util.Scanner;

public class practiceinput
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

//        ------------(     1      )------------

//        System.out.println("english:=");
//        float english=sc.nextFloat();
//        System.out.println("Hindi:=");
//        float hindi=sc.nextFloat();
//        System.out.println("science:=");
//        float science=sc.nextFloat();
//        System.out.println("maths:=");
//        float maths=sc.nextFloat();
//        System.out.println("sst:=");
//        float sst=sc.nextFloat();
//        System.out.println("Sum of total subjects number:= ");
//        float sum=english+hindi+science+maths+sst;
//        System.out.println(sum);
//        System.out.println("Percentage :=");
//        float percentage=(sum/500)*100;
//        System.out.println(percentage);

//        ------------(     2      )------------

//        System.out.println("num1:=");
//        int a=sc.nextInt();
//        System.out.println("num2:=");
//        int b=sc.nextInt();
//        System.out.println("num3:=");
//        float c=sc.nextFloat();
//        System.out.println("num4:=");
//        float d=sc.nextFloat();
//        System.out.println("Sum of two number:=");
//        float sum1=c+d;
//        System.out.println(sum1);

//        ------------(     3      )------------

//        System.out.println("enter a A1:=");
//        int a1=sc.nextInt();
//        System.out.println("enter a B2:=");
//        int b2=sc.nextInt();
//        if (a1<b2)
//        {
//            System.out.println("b2 is bigger");
//        }
//        else
//          {
//              System.out.println("B2 is lesser the A1");
//            }

//        ------------(     4      )------------
//        System.out.println("enter a number1:=");
//        int num=sc.nextInt();
//        if (num%2==0)
//        {
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }

//        ------------(     5      )------------

        System.out.println("Enter the marks:=");
        int a=sc.nextInt();
        if(a>=33)
        {
            System.out.println("pass");

        }
        else
        {
            System.out.println("fail");
        }



    }
}
