package daily_5_program_Register.date_25_06_23;

import java.util.Arrays;

public class find_1st_2nd_3rd_max
{
    public static void main(String[] args)
    {
        int arr[] = {23,11,33,37,83,49,73,6,52,2,47,2,94,6,74,8,59,4};
        int max = arr[0];
        int secd_max = arr[1];
        int third_max=arr[2];

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

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
        }
        System.out.println(Arrays.toString(arr));



        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                third_max=secd_max;
                secd_max=max;
                max=arr[i];
            }
            else if (arr[i]>secd_max && arr[i]!=max)
            {
                third_max=secd_max;
                secd_max=arr[i];
            }
            else if (arr[i]>third_max && arr[i]!=secd_max && arr[i]!=max)
            {
                third_max=arr[i];
            }
        }
        System.out.println("maximum Number in given Array:=" + max);
        System.out.println("Second maximum Number in given Array:=" + secd_max);
        System.out.println("third Maximum Number in given Array:=" + third_max);
    }
}
