package array_programs;

import java.util.Scanner;

public class array_copy
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int arr2[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Array List:=");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array List:= ");
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+", ");
        }
        System.out.println();
        System.out.print("Copy Array:= ");
        for (int k=0;k<arr.length;k++)
        {
            arr2[k]=arr[k];
            System.out.print(arr2[k]+", ");
        }
    }
}
