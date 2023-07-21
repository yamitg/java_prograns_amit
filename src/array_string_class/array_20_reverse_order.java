package array_string_class;

public class array_20_reverse_order
{
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 26};
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while (start<=end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array list is:= ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }

    }
}
