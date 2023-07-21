package array_string_class;

import java.util.Scanner;

//  write a java program to design a method that can return
//  first occurrence of a given character present in a given array of char type

public class array_22_char_occurrence_first
{
    public static void main(String[] args)
    {
        char arr[]={'m','i','t','k','u','m','r','y','a','d','a','v'};
        int start=0;
        int end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:= ");
        char ch=sc.next().charAt(0);
        int index=-1;
        while (start<end)
        {
            int mid=(start+end)/2;
            if (ch==arr[mid])
            {
                index=mid;
                break;
            }
            else if(ch<arr[mid])
            {
                end=mid-1;
            }
            else if (ch>arr[mid])
            {
                start=mid+1;
            }
        }
        System.out.println(arr[index]+"First Occurrence of="+index);
    }

}

