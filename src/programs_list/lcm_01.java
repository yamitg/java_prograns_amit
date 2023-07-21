package programs_list;

import java.util.Scanner;

public class lcm_01
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers you to find the LCM:=");
        int n=sc.nextInt();
        int arr[]=new int[5];
        System.out.print("Enter the lcm range:=");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("LCM NUMBERS:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int i;
        for (i=1; ;i++)
        {
            if (i%arr[0]==0 && i%arr[1]==0 && i%arr[2]==0 && i%arr[3]==0 &&i%arr[4]==0)
            {
                break;
            }
        }
        System.out.println("LCM is :="+i);
        int j;
        for (j=1; ;j++)
        {
            if (i%arr[0]==0 && i%arr[1]==0 && i%arr[2]==0 && i%arr[3]==0 &&i%arr[4]==0)
            {
                break;
            }
        }
        System.out.println("LCM is :="+i);
    }
}
