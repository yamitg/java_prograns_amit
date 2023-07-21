package java_100_comm_list;

public class fequency_of_all_num
{
    public static void main(String[] args)
    {
        int arr[]={3,4,5,1,23,3,1,34,4,5,1,8,4,3,8,45,23};
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i]+" are number of times present:= "+count);
        }

    }
}
