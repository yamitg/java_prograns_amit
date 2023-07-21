package array_string_class;

import java.util.Scanner;

public class array_02_display_even_index_elements
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Display even index Array elements:= ");
        for(int i=0;i<5;i++)
        {
            if( i%2==0 )
            {
                System.out.println(arr[i]+", ");
            }
        }

    }
}
