package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class array_short_equals_copy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[7];
        int arr2[]={0, 2, 21, 22, 23, 29, 3430,};
        arr1[0]=3430;
        arr1[1]=29;
        arr1[2]=2;
        arr1[3]=23;
        arr1[5]=21;
        arr1[6]=22;
        Arrays.sort(arr1);
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+", ");
        }
        System.out.println("===============================");
        boolean b=Arrays.equals(arr1,arr2);
        System.out.print("IS it both Arrays are equal:="+b);

        int arr3[]=Arrays.copyOf(arr1,7);
        for (int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]+", ");
        }
    }
}
