package array_programs;

import java.util.Scanner;

public class array_mirror_matrix_2d
{
    public static void main(String[] args)
    {
        int arr1[][]=new int[3][3];
//        int arr2[][]=new int[3][3];

        Scanner sc=new Scanner(System.in);
        System.out.print("Array Matrix:=");

        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print Array Matrix:=");
        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr1.length;j++)
            {

                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Array Mirror Matrix:=");
        for (int i=0;i<arr1.length;i++)
        {
            for (int j=arr1.length-1;j>=0;j--)
            {

                System.out.print(arr1[j][i]+" ");
            }
            System.out.println("");
        }

    }
}
