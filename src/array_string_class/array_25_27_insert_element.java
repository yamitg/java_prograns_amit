package array_string_class;
// write a java program to read an element from the user and insert
// that element in a given array at  particular index.

import java.util.Scanner;

public class array_25_27_insert_element
{
    public static int[] insert_element(int arr[],int arr1[],int index,int element)
    {
        for (int i=0;i<arr1.length;i++)
        {
            if (i<index)
            {
                arr1[i]=arr[i];
            }
            else if (index==i)
            {
                arr1[i]=element;
            }
            else if (i>index)
            {
                arr1[i]=arr[i-1];
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
        int arr1[]=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index:= ");
        int index=sc.nextInt();
        System.out.print("Enter the element which want u to insert:= ");
        int element=sc.nextInt();
        insert_element(arr,arr1,index,element);
        System.out.print("New Array:= ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
    }

}
