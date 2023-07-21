package arrayProgram_01_33;

import java.util.Scanner;

public class secondOccurrence
{
    public static void main(String[] args)
    {

        int arr[] = {1, 23, 3, 5, 51, 2, 34, 45, 55, 54, 54, 6, 56, 2, 45, 54, 95, 24, 45};
        int temp = 0;
        System.out.print("Array list: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;
        System.out.print("Enter the element for which you want to find the occurrence: ");
        Scanner sc = new Scanner(System.in);
        int ele_ocu = sc.nextInt();
        int index_num = second_occurrence(arr, ele_ocu, start, end);
        System.out.println("Second Occurrence Number: " + index_num);
    }

    public static int second_occurrence(int arr[], int ele_ocu, int start, int end) {
        int i;
        int mid =0;
//        System.out.print("\n mid:="+mid);
//        {1, 2, 2, 3, 5, 6, 23, 24, 34, 45, 45, 45, 51, 54, 54, 54, 55, 56, 95,};
        for (i = 0; i <arr.length ; i++)
        {
            mid = (start + end) / 2;
            if (arr[mid] == ele_ocu)
            {
                System.out.println("Index: " + mid);
                break;
            }
            else if (arr[mid] < ele_ocu)
            {
                end = mid - 1;
            }
            else if (arr[mid] > ele_ocu)
            {
                start = mid + 1;
            }
        }
        return mid;


    }
}
