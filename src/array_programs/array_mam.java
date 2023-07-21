package array_programs;

import java.util.Scanner;

public class array_mam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println(arr);
        System.out.print("Enter THe Name:=");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+", ");
        }
    }
}

