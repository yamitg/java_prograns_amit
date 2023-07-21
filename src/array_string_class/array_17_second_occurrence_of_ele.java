package array_string_class;

import java.util.Scanner;

public class array_17_second_occurrence_of_ele
{
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 51, 2, 34, 45, 55, 54,54, 6, 56,2, 45, 54, 95, 24, 45,};
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
        System.out.print("Enter in Element which want to occurrence:");
        Scanner sc = new Scanner(System.in);
        int ele_ocu = sc.nextInt();
        int index_num= second_occurrence(arr,ele_ocu,start,end);
        System.out.print("Second Occurrence Number:= "+index_num);
    }

    public static int second_occurrence(int arr[],int ele_ocu,int start,int end)
    {
        int i;
        for (i=arr.length-1;i>=0;i--)
        {
            int mid=(start+end)/2;
//            System.out.print("mid:-= "+arr[mid]);
            if (arr[i]==ele_ocu)
            {
                System.out.println("index:= "+i);
                break;
            }
            else if (arr[i]<ele_ocu)
            {
                end=mid-1;
//                System.out.println("end := "+arr[end]+", ");
            }
            else if (arr[i]>ele_ocu)
            {
                start=mid+1;
//                System.out.println("Start := "+arr[start]+", ");
            }
        }
        return i;
    }
}
