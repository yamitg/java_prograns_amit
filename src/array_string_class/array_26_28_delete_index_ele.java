package array_string_class;

// write a java program to read the index value from the user and delete an
// element present at a given index in array of int type.

import java.util.Scanner;

public class array_26_28_delete_index_ele
{
    public static int[] insert_element(int arr[],int arr1[],int index)
    {
        for (int i=0;i<arr1.length;i++)
        {
            if (i<index)
            {
                arr1[i]=arr[i];
            }
            else
            {
                arr1[i]=arr[i+1];
            }
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 51};
        System.out.print("old Array:= ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        int arr1[]=new int[arr.length-1];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index:= ");
        int index=sc.nextInt();
        insert_element(arr,arr1,index);
        System.out.print("New Array:= ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
    }



}
