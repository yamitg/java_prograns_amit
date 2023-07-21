package array_string_class;

import java.util.Scanner;

public class array_29_count_fequ_of_single_ele
{
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 51, 2, 34, 4, 55, 54, 6, 56, 4, 34, 95, 4, 45,};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which want u count/frequency:= ");
        int number=sc.nextInt();
        for (int i=0;i<arr.length;i++)
        {
            if(number==arr[i])
            {
                count++;
            }
        }
        System.out.print("Element "+number+" is "+count+" times present in this Array list .");
    }
}
