package array_string_class;

import java.util.Scanner;

public class array_30_count_fequ_of_single_char
{
    public static void main(String[] args)
    {

        char arr[] = {'a','m', 'i', 't', 'k', 'u', 'm', 'r', 'y', 'a', 'd', 'a', 'v'};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character which want u count/frequency:= ");
        char ch=sc.next().charAt(0);
        for (int i=0;i<arr.length;i++)
        {
            if(ch==arr[i])
            {
                count++;
            }
        }
        System.out.print("Element "+ch+" is "+count+" times present in this Array list .");



    }
}
