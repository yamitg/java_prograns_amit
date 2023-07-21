package array_programs;

import java.util.Scanner;

public class array_2D_addition
{
    public static void main(String[] args)
    {
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int arrR[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Matrix ISt:=:=");

        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Array Matrix 2nd:=");
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Addition of 2D Array[3][3]:=");
        for (int i=0;i<arrR.length;i++)
        {
            for (int j=0;j<arrR.length;j++)
            {
                arrR[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arrR[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
