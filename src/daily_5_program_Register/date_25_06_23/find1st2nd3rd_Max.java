package daily_5_program_Register.date_25_06_23;

public class find1st2nd3rd_Max
{
    public static void main(String[] args)
    {
        int arr[]={2,14,6,77,34,23,34,45,5,5,34,6,4,45,5,35};
        int max=arr[0];
        int secondMax=arr[1];
        int thirdMax=arr[2];
        System.out.print("Array in Ascending Order:=");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+", ");
            if (arr[i]>max)
            {
                thirdMax=secondMax;
                secondMax=max;
                max=arr[i];
            }
            else if (arr[i]>secondMax && arr[i]!=max)
            {
                thirdMax=secondMax;
                secondMax=arr[i];
            } else if (arr[i]>thirdMax && arr[i]!=secondMax && arr[i]!=max)
            {
                thirdMax=arr[i];
            }
        }
        System.out.println("\nMax Number:= "+max);
        System.out.println("\nSecond Max Number:= "+secondMax);
        System.out.println("\nThird Max Number:= "+thirdMax);
    }
}
