package array_string_class;

import java.util.Scanner;

public class array_14_element_present
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The element:= ");
        int n=sc.nextInt();
        boolean result=check_element(n);
        System.out.println("Condition is := "+result);
    }

    public static boolean check_element(int n) {
        int arr[] = {3, 24, 15, 4, 5, 88, 5, 45, 6, 23, 5, 21, 5};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                return true;
            }
        }
        return false;
    }
}
