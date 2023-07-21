package array_programs;

import java.util.Scanner;

public class array_binary_search
{
    public static void main(String[] args) {
        int arr[] = {31,6,12,3,54,7,245,7,45,3,4,64,8,7,5,644,56,4,2446,56};
        Scanner sc = new Scanner(System.in);
        int temp;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Array Elements:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");

        int start=0;
        int end=arr.length-1;
        int index=-1;
        System.out.print("Enter the array Element:=");
        int n=sc.nextInt();
        while(start<=end)
        {
            int mid=(start+end)/2;
            if (arr[mid] == n)
            {
                index = mid;
                break;
            }
            else if (n > arr[mid])
            {
                start = mid + 1;
            }
            else if (n < arr[mid])
            {
                end = mid - 1;
            }
        }
        System.out.println("Index Number:="+index);
    }

}
