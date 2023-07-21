package array_string_class;

public class array_08_int_type_largest_ele_find
{

    public static void main(String[] args)
    {
        double arr[]={112.32,233.32,334.54,65.66,878.78,877.7};
        double largest=arr[0];
        System.out.print("Largest element In the Array list:= ");
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);

    }


}
