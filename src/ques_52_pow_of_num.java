import java.util.Scanner;
public class ques_52_pow_of_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("A:=");
        int a=sc.nextInt();
        System.out.print("B:=");
        int b=sc.nextInt();
        int pow=1;
        for (int i=1; i<=b; i++)
        {
            pow=pow*a;
        }
        System.out.println(b+" is Power of "+ a+":="+pow);
    }
}
