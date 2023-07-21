package arrayProgram_01_33;

public class array_thirdMInNumber_03
{
    public static void main(String[] args)
    {
        int arr[] = {23,11,33,37,83,49,73,6,52,2,47,2,94,6,74,8,59,4};
        int min = arr[0];
        int secd = arr[1];
        int third=arr[2];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                third=secd;
                secd = min;
                min = arr[i];
            }
            else if (arr[i] < secd && arr[i] != min)
            {
                third=secd;
                secd = arr[i];
            }
            else if (arr[i]<third && arr[i]!=min && arr[i]!=secd)
            {
                third=arr[i];
            }
        }
        System.out.println("Smallest Number in given Array:=" + min);
        System.out.println("Second Smallest Number in given Array:=" + secd);
        System.out.println("third Smallest Number in given Array:=" + third);
    }
}
