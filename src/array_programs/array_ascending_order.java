package array_programs;

import java.util.Scanner;

public class array_ascending_order
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array items:= ");
        int count=0;
        int temp=0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array:=");
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+", ");
        }
//         23,12,34,123,2,45
        System.out.print("Ascending Order Array:= ");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            System.out.print(arr[i]+", ");
        }

    }
}
