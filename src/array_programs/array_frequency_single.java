package array_programs;

public class array_frequency_single
{
    public static void main(String[] args)
    {

        int arr[]={1,2,1,2,2,1,3};
        int element =2;
//        for (int i=0;i<arr.length;i++)
//        {
            int count=0;
            for (int j=0;j<arr.length;j++)
            {
                if (element==arr[j])
                {
                    count++;
                }

            }
        System.out.println(element+":= "+count);

//        }

    }
}
