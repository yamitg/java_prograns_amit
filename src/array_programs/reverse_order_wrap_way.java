package array_programs;

import java.util.Scanner;

public class reverse_order_wrap_way
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array:=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the Elements in Array:=");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp;
        int start=0;
        int end=arr.length-1;
           while (start<end)
           {
               temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }

        System.out.print(" After swapping array Elements:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }

    }
}
