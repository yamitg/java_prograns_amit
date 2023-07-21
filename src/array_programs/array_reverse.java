package array_programs;

public class array_reverse
{
    public static void main(String[] args)
    {
        int arr[]={45,6543,987654,67,7654,34,7654,765423456,765};
        System.out.print("Before Reverse Array list:= ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.print("After Reverse Array list:= ");
        for (int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+", ");
        }

    }
}
