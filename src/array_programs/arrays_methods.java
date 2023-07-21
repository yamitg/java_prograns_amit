package array_programs;

import java.util.Scanner;

public class arrays_methods
{

    public static void display_elements()
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


        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Array elements:="+arr[i]);
        }
        System.out.println("=========Happy Ending !!==========");
    }

    public static void main(String[] args)
    {
        display_elements();

    }
}
//  WaJP to design a method to create a array of int type for the given size
//  and also display all the elements entered by the user in a same method .