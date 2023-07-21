//---------------Reverse Order in Arrays--------------

import java.util.Scanner;

public class array_02
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements in array:=");
        for (int i=0;i<=arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Elements:=");
        for (int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]+" , ");
        }
        System.out.println("Reverse Order:=");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" , ");
        }
    }
}
