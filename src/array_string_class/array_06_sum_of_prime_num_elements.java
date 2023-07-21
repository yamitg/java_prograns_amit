package array_string_class;

import java.util.Scanner;

public class array_06_sum_of_prime_num_elements
{
    public static void main(String[] args)
    {

        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the array elements:= ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Prime number in array list:=");
        for (int i = 0; i < arr.length; i++)
        {
            int count=0;
            for (int j=2;j<=arr[i]/2;j++)
            {
                if (arr[i]%j==0)
                {
                    count++;
                }
            }

            if(count==0)
            {
                System.out.print(arr[i]+", ");
                sum=sum+arr[i];
            }
        }
        System.out.println(" ");
        System.out.print("Sum of all prime number:= "+sum);
    }
}
