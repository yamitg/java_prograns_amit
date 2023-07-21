package array_programs;

import java.util.Scanner;

public class array_smallest_num
{
    public static void main(String[] args)
    {
//        int arr[]={11,17,45,3}
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

        int small=arr[0];
//        10,345,46,234,5,7,
        for (int i=0;i<arr.length;i++)
        {
           for (int j=i+1;j<arr.length;j++)
           {
               if (arr[j]<small)
               {
                   small=arr[j];
               }
           }
        }
        System.out.println("Smallest Number:="+small);
    }
}
