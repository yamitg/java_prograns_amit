package array_string_class;

import java.util.Scanner;

public class array_05_sum_of_even_index_elements
{

    public static void main(String[] args)
    {
        double arr[]=new double[5];
        Scanner sc=new Scanner(System.in);
        double sum=0;
        System.out.println("Enter the array elements:= ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        System.out.print("Double type even index Array elements:= ");
        for(int i=0;i<5;i++)
        {
            if( i%2==0 )
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
