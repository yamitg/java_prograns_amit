public class array_rev_swap_method
{
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50};
        int start=0;
        int end=arr.length-1;
//        System.out.print(end);
        reverse_array(arr,0,arr.length-1);

        System.out.print("Swapped Array:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
    public static void reverse_array(int arr[],int start,int end)
    {

        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
