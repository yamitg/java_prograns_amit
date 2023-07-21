package array_programs;

import java.util.Scanner;

public class array_char_type
{
    public static void main(String[] args)
    {
        char arr[]={'a','m','i','t','k','u','m','a','r','y','a','d','a','v'};
//        int arr[]={10,20,30,40,50,60};
        int start=0;
        int end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array:=");
        char ch=sc.next().charAt(0);
        int index=-1;
//        Question Ass.= 1
        for (char i=0;i<arr.length;i++)
        {
            if (arr[i]==ch)
            {
                index=i;
                System.out.println("Index: "+i+" = "+arr[i]);
            }
        }
//      Question Ass.= 2
        for (char i=0;i<arr.length;i++)
        {
            if (arr[i]==ch)
            {
                System.out.println("True");
                break;
            }
            else
            {
                System.out.println("False");
            }
//            Question Ass.= 3

//            array_swapping.swap(arr,start,end);
            for (char j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]);
            }
        }




    }
}
