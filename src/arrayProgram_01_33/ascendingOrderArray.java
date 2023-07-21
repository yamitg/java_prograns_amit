package arrayProgram_01_33;

public class ascendingOrderArray
{
    public static void main(String[] args)
    {
        int arr[]={23,11,33,37,83,493,473,6,52,2,47,2,94,6,74,8,59,4};
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+",");
        }
    }
}
