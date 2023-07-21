package array_string_class;

import java.util.Scanner;

public class array_10_sum_of_element_return
{
    public static void main(String[] args)
    {
        int sum=0;
        int total =display_array(sum);
        System.out.println("Total sum:= "+total);
    }
    public static int display_array(int sum)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array:= ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the Elements In Array:= ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }


}
