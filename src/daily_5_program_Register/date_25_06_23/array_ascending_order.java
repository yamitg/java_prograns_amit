package daily_5_program_Register.date_25_06_23;

public class array_ascending_order
{
    public static void main(String[] args)
    {
        int arr[]={2,14,6,77,34,23,34,45,5,5,34,456,4,45,5,35};
        System.out.println("array:=");
        for (int i=0;i<arr.length;i++)
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
            System.out.print(arr[i]+", ");
        }
    }
}