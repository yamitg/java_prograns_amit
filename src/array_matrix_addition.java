import java.util.Scanner;

public class array_matrix_addition
{
    public static void main(String[] args)
    {
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        int arr3[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Ist matrix :=");
        for(int i=0; i<arr1.length; i++)
        {
            for (int j=0;j<arr1.length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the 2nd Array:=");
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix Ist:=");
        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr1.length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Enter 2nd Matrix:=");
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Result Matrix:=");
        for (int i=0;i<arr3.length;i++)
        {
            for (int j=0;j<arr3.length;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
}
