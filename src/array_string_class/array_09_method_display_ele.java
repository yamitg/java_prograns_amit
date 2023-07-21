package array_string_class;
import java.util.Scanner;
public class array_09_method_display_ele
{
    public static void main(String[] args)
    {
        int arr[]=array_09_method_display_ele.display_array();
//        int arr[]=display_array();
        System.out.print("Display the Array elements:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static int[] display_array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array:= ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the Elements In Array:= ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
