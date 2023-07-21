package array_programs;

import java.util.Scanner;
public class array_insert_sort_method
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:= ");
        int size=sc.nextInt();
        System.out.print("Enter the Elements in Array:= ");

        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("OLd Array Elements:= ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }

        int arr1[]=new int[arr.length+1];
        System.out.print("Enter the Index Value:= ");
        int index=sc.nextInt();
        System.out.print("Enter the element Which is u want to insert:= ");
        int ele=sc.nextInt();
//        arr[index]=ele;
        insert_ele(arr,arr1,index,ele);
        System.out.print("New Array elements:= ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+", ");
        }
    }
    public static void insert_ele(int arr[],int arr1[],int index,int ele)
    {
        for (int i=0;i<arr1.length;i++)
        {
            if (i<index)
            {
                arr1[i]=arr[i];
            }
            else if (i==index)
            {
                arr1[i]=ele;
            } else if (i>index)
            {
                arr1[i]=arr[i-1];
            }
        }
    }
}