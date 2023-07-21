import java.util.Scanner;
public class percentage
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a marks in english:=");
        float english=sc.nextFloat();
        System.out.println("enter a marks in hindi:=");
        float hindi=sc.nextFloat();
        System.out.println("enter a marks in science:=");
        float science=sc.nextFloat();
        System.out.println("enter a marks in maths:=");
        float maths=sc.nextFloat();
        System.out.println("enter a marks in sst:=");
        float sst=sc.nextFloat();
        float sum=english+hindi+science+maths+sst;
        System.out.println("sum of the total subjects:=");
        System.out.println(sum);
        float y=500;
        float per=sum/y*100;
        System.out.println("Percentage:=");
        System.out.println(per);

    }

}
