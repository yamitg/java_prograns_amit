package array_programs;

import java.util.Scanner;

public class array_2D
{
    public static void main(String[] args)
    {
        int arr[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.print("Array List:=");

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("2-D Arrays:=");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
