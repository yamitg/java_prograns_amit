package array_string_class;

import java.util.Scanner;

public class array_15_index_value
{

    public static void main(String[] args)
    {
        int arr[]={1,2,4,5,6,8,9,4,567,6,5,};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The element:= ");
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
                System.out.println("Element"+arr[i]+":= "+i);
            }

            else if(arr[i]!=n)
            {
                System.out.println("-1");
            }
        }
    }

}
