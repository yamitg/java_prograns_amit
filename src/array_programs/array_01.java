package array_programs;

import java.util.Scanner;

public class array_01
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Array:=");
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array list:= ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(+arr[i]+", ");
        }

    }
}
