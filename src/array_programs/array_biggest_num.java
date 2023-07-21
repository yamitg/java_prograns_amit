package array_programs;

import java.util.Scanner;

public class array_biggest_num
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array items:= ");
        int big=arr[0];
        int temp=0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Biggest Number:=");
        for (int j=1;j<arr.length;j++)
        {
            if (arr[j]>big)
            {
                big=arr[j];
            }
        }
        System.out.println(big+", ");
    }
}
