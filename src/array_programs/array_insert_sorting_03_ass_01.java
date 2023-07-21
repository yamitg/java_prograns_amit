package array_programs;

import java.util.Scanner;

public class array_insert_sorting_03_ass_01
{
    public static void main(String[] args)
    {
        System.out.print("Enter the element which want to insert:=");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        System.out.print("Enter the index value:=");
        int index=sc.nextInt();

        array_insert_sorting_02.insert_element(element,index);
    }
}
