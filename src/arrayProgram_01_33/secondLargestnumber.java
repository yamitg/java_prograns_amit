package arrayProgram_01_33;

public class secondLargestnumber
{
    public static void main(String[] args)
    {
        int arr[]={23,11,33,37,83,493,473,6,52,2,47,2,94,6,74,8,59,4};
        int largest=arr[0];
        int secdLargest=arr[1];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                secdLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secdLargest && arr[i]!=largest)
            {
                secdLargest=arr[i];
            }
        }
        System.out.println("Second largest number := "+secdLargest);
        System.out.println("First largest number := "+largest);

    }
}
