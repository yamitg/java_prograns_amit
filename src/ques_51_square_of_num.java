import java.util.Scanner;

public class ques_51_square_of_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("A:=");
        int a=sc.nextInt();
//        System.out.println("B:=");
//        int b=sc.nextInt();
        int pow=1;

        for (int i=1; i<=2;i++)
        {
            pow=pow*a;
        }
        System.out.println("Square of "+ a+":="+pow);

    }
}
