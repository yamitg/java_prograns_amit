package array_string_class;

public class array_19_given_data_in_sorted
{
    public static void main(String[] args)
    {
        int arr[] = {1, 23, 3, 5, 51, 2, 34, 45, 55, 54, 6, 56, 45, 34, 95, 24, 45,};
        int temp = 0;
        System.out.print("Array list:= ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ",");
        }

    }
}
