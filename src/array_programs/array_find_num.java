package array_programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class array_find_num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an array list:=");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter The array elements:=");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Number which want to find out:=");
        int n=sc.nextInt();
//        boolean result=true;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
                System.out.println("True , Number is present in Array:="+arr[i]);
                break;
//                return true;
            }
            else
            {

//                System.out.println("False , Number is present in Array:="+arr[i]);
            }
        }


    }
}
