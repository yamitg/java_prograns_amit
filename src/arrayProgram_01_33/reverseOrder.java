package arrayProgram_01_33;

public class reverseOrder
{
    public static void main(String[] args)
    {
        int arr[]={2,45,47,56,3,2,56,34,88,2,356,5,66,88};
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
