package array_string_class;

import java.util.Scanner;

public class array_01_display_elements
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Display Array:= ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }

    }
}
