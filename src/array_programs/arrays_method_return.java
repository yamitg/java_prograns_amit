package array_programs;

import java.util.Scanner;

public class arrays_method_return
{


    public static int[] display_elements()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:=");
        int size =sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements:= ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int arr1[] =display_elements();
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println("Array elements:="+arr1[i]);
        }
        System.out.println("=========Happy Ending !!==========");

    }

}

