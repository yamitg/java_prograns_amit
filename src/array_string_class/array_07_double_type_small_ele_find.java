package array_string_class;

import java.util.Scanner;

public class array_07_double_type_small_ele_find
{
    public static void main(String[] args)
    {
        double arr[]={112.32,233.32,334.54,65.66,878.78,877.7};
        double smallest=arr[0];
        System.out.print("Smallest element In the Array list:= ");
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println(smallest);

    }

}
