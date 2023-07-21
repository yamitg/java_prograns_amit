package arrayProgram_01_33;

public class array_secondMinNumber_02
{
    public static void main(String[] args)
    {
        int arr[]={23,89,92,37,83,49,73,6,52,2,47,94,6,74,8,59,4};
        int first_smallest=arr[0];
        int second_smallest=arr[1];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<first_smallest)
            {
                second_smallest=first_smallest;
                first_smallest=arr[i];
            }
            else if (arr[i]<second_smallest && arr[i]!=first_smallest)
            {
                second_smallest=arr[i];
            }
        }
        System.out.println("Second Largest Number:="+second_smallest);
        System.out.println("first Largest Number:="+first_smallest);
    }
}
