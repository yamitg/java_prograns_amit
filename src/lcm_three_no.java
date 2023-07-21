import java.util.Scanner;

public class lcm_three_no
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the 1st number:=");
//        int a=sc.nextInt();
//        System.out.print("Enter the 2nd number:=");
//        int b=sc.nextInt();
//        System.out.print("Enter the 3rd number:=");
//        int c=sc.nextInt();
//
//        for (int i=1; ;i++)
//        {
//            if (i%a==0 && i%b==0 && i%c==0)
//            {
//                System.out.println("LCM:="+i);
//                break;
//            }
//        }


        System.out.print("Enter the number:=");
        int n=sc.nextInt();
         int i=1;
        int rem=1;
         while (n>0)

             {
                 rem=n%10;
                 System.out.print(rem);
                 n=n/10;
             }



    }
}
