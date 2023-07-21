package array_programs;

import java.util.Scanner;

public class array_largest_num
{
    public static void main(String[] args)
    {
//
        int arr[]=new int[3];
        System.out.print("Enter the Array elements:=");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Array elements := "+arr[i]);
        }
        int sum=0;

        int large=arr[0];
//        int arr[]={11,17,45,3}
        for (int i=1;i<arr.length;i++)
        {
                if (arr[i]>large)
                {
                    large=arr[i];
                }

        }
        System.out.println("Largest Number:="+large);
    }
}
