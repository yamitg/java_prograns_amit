package array_string_class;

import java.util.Scanner;

public class array_16_first_occurrence_of_ele
{
    static int arr2[];
    static int count=0;
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 51, 2, 34, 45, 55, 54, 6, 56, 45, 34, 95, 24, 45,};
        int arr1[]=new int[arr.length];
        int temp = 0;
        System.out.print("Array list:= ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
        for (int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.print("NEw Array :=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
        System.out.print("\n"+"Enter in Element which want to occurrence:");
        Scanner sc = new Scanner(System.in);
        int ele_ocu = sc.nextInt();
        int index_num= display_index(arr1,ele_ocu);
        System.out.println("\n Ind:="+index_num);


    }

    public static int display_index(int arr1[],int ele_ocu)
    {
        int j;
        for ( j=0;j<arr1.length;j++)
        {
            if (arr1[j] == ele_ocu)
            {
//                count++;
                System.out.print("Index_number:= " + j);
//                arr2[j]=j;
                break;
            }
        }
//        return count;
        return j;
//        return arr2;
    }
}
