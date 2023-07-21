package daily_5_program_Register.date_25_06_23;

public class findMax
{
    public static void main(String[] args)
    {
        int arr[]={2,14,6,77,34,23,34,45,5,5,34,456,4,45,5,35};
        int max=arr[0];
        for (int i=0;i<=arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
