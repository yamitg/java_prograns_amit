package array_string_class;

public class array_31_count_fequ_of_all_ele
{
    public static void main(String[] args)
    {
        int arr[]={5,10,7,3,4,2,5,7,3,10,2,10,3};
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int count=1;
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
            System.out.print(arr[i]+":= "+count+", ");
        }
    }
}
