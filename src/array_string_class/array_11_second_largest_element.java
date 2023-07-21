package array_string_class;
public class array_11_second_largest_element
{
    public static void main(String[] args)
    {
        int arr[]={23,89,92,37,83,49,73,6,52,3,47,94,6,74,8,59,2};
        int first_lar=arr[0];
        int second_lar=arr[1];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>first_lar)
            {
                second_lar=first_lar;
                first_lar=arr[i];
            }
        }
        System.out.println("Second Largest Number:="+second_lar);
        System.out.println("first Largest Number:="+first_lar);

    }

}
