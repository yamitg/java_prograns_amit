package array_string_class;

import java.util.Arrays;

public class array_13_third_small_large_element
{
    public static void main(String[] args)
    {
        int arr[]={3,24,15,4,5,88,5,45,6,23,5,21,5};
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int first_smallest=arr[0];
        int second_smallest=arr[1];
        int third_smallest=arr[2];
        int first_lar=arr[0];
        int second_lar=arr[1];
        int third_lar=arr[2];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i] < first_smallest)
            {
                third_smallest = second_smallest;
                second_smallest = first_smallest;           // ss=3
                first_smallest = arr[i];                    //fs=2
            }
            else if (arr[i] < second_smallest )
            {
                third_smallest = second_smallest;
                second_smallest = arr[i];
            }

        }
        System.out.println("third Smallest Number:="+third_smallest);
        System.out.println("Second Smallest Number:="+second_smallest);
        System.out.println("first Smallest Number:="+first_smallest);

    }
}
