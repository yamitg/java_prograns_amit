package array_programs;

import java.util.Arrays;

public class reverseArray
{
    public static void main(String[] args)
    {
         int arr1[]={1,2,3,4,5,};
         int arr2[]={5,6,7,8,9,};

        System.out.println("Array 1 before Swapping:= "+Arrays.toString(arr1));
        System.out.println("Array 2 before Swapping:= "+Arrays.toString(arr2));

         for (int i=0;i< arr1.length;i++)
         {
             arr1[i]=arr1[i]+arr2[i];
             arr2[i]=arr1[i]-arr2[i];
             arr1[i]=arr1[i]-arr2[i];
         }
        System.out.println("Array 1 after Swapping:= "+Arrays.toString(arr1));
        System.out.println("Array 2 after Swapping:= "+Arrays.toString(arr2));
    }
}
