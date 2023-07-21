package array_string_class;

public class max_min_sum
{
    public static void main(String[] args)
    {
        int arr[]={20,48,36,48,5,25,34,73,92,16,289,34,21,21,12};
        int subtract=0;
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("MAx num:-= "+max);
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("MAx num:-= "+min);
        subtract=max-min;
        System.out.println("Difference b/w MAX "+max+" and MIN "+min+" NUmber is:= "+subtract);
    }
}
