public class array_hcf
{
    public static void main(String[] args)
    {
        int arr[]={4,6,8,12,16};
        int i; int hcf=1;
//        for (i=1; i<=arr[0] && i<=arr[1] && i<=arr[2] && i<=arr[3];i++)
        for (i=1; i<=arr[0] && i<=arr[1] && i<=arr[2] && i<=arr[3] && i<=arr[4];i++)
        {
            if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0 && arr[3]%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("hcf of array:="+i);

    }
}
