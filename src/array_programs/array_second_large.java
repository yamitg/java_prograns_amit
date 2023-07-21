package array_programs;

import java.util.Scanner;

public class array_second_large
{
//    WAJP find out second largest elemnet in a array

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Array elements:=");
        int arr[]=new int[4];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Array Elements := "+arr[i]);
        }
//        int temp=0;
//        22,29,33,23
        int fmax=arr[0];
        int smax=arr[1];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>fmax)
            {
//              ist_large=arr[i];
                smax =fmax;
                fmax=arr[i];
            }
            else if (arr[i]>smax && arr[i]!=fmax)
            {
                smax=arr[i];
            }
        }
        System.out.print(" First Largest:=" + fmax);
        System.out.println(" Second Largest:=" + smax);
    }
}
