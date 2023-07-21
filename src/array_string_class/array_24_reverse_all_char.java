package array_string_class;

public class array_24_reverse_all_char
{
    public static char[] reverse_char(char arr[],int start,int end)
    {
        while(start<=end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        char arr[] = {'a','m', 'i', 't', 'k', 'u', 'm', 'r', 'y', 'a', 'd', 'a', 'v'};
//        char arr1[]=new char[arr.length-1];
        int start=0;
        int end= arr.length-1;
        char arr1[] = reverse_char(arr, start, end);
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }

    }
}
