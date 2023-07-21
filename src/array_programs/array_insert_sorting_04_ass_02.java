package array_programs;

import java.util.Scanner;

public class array_insert_sorting_04_ass_02
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index value:=");
        int index=sc.nextInt();
        delete_element(4);
    }
    public static void delete_element(int index)
    {
        int arr[] = {20, 763, 48, 25, 459, 63, 489, 256, 47};
        System.out.print("Old Array:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        int arr1[] = new int[arr.length-1];

        for (int i=0;i<arr1.length;i++)
        {
            if(i<index)
            {
                arr1[i]=arr[i];
            }

//            else  (i>index)
            else
            {
                arr1[i]=arr[i+1];
            }
        }
        System.out.print("NEW Array:=");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }

    }
}
