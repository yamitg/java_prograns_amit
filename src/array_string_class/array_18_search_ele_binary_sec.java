package array_string_class;

import java.util.Scanner;

public class array_18_search_ele_binary_sec
{
    public static void main(String[] args)
    {
            int arr[] = {1, 23, 3, 5, 51, 2, 34, 45, 55, 54, 6, 56, 45, 34, 95, 24, 45,};
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
            int start=0;
            int end=arr.length-1;
            int index=-1;
            System.out.print("Enter in Element which want to find:");
            Scanner sc = new Scanner(System.in);
            int element = sc.nextInt();
            present_ele_check(arr,element);
            int result=search_element(arr,element,start,end,index);
            System.out.println(arr[result]+" is on index:= "+result);
    }
        public static boolean present_ele_check(int arr[],int element)
        {
            for (int j=0;j<arr.length;j++)
            {
                if (arr[j]==element)
                {
                    return true;
                }
            }
            return false;
        }
    public static int search_element(int arr[],int element,int start,int end,int index)
    {
       while(start<=end)
       {
               int mid = (start + end) / 2;
               if (element == arr[mid])
               {
                   index=mid;
                   break;
               }
               else if (element < arr[mid])
               {
                   end = mid - 1;
               }

               else if (element > arr[mid])
               {
                   start = mid + 1;
               }
           }
        return index;
    }
}
