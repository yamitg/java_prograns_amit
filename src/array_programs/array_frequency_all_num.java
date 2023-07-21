package array_programs;

public class array_frequency_all_num
{
    public static void main(String[] args)
    {

        int arr[]={5,10,7,3,4,10,2,10,3};
        int length=arr.length;
            for (int i=0;i<arr.length;i++)
            {
                int count=1;
                for (int j=i+1;j<length;j++)
                {
                    if (arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=arr[length-1];
                        length--;
                        j--;
                    }
                }
                    System.out.println(arr[i]+":= "+count);
            }
    }

}
