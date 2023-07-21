package array_programs;

import java.util.Scanner;

public class array_descending_order
{
    public static void main(String[] args)
    {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:=");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
//        23,13,34,123,2,45
        int temp=0;
        System.out.print("Array in descending order:=");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(arr[i]+", ");
        }

    }
}
