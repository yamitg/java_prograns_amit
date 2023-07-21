package array_string_class;

import java.util.Scanner;

public class array_04_sum_of_all_elements

{

    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the array elements:= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Sum of all Array elements:= ");
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
