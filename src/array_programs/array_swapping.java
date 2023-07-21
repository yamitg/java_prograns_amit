package array_programs;

import java.util.Scanner;

public class array_swapping
{
    public static void swap(int arr[], int s, int e)
    {
        while (s < e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }

    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array:=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements in Array:=");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        swap(arr, 0, n - 1);
        System.out.print("Swapping Array List:= ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
