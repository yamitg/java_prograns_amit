package array_programs;

public class array_insert_sorting_02
{

    public static void main(String[] args)
    {
        insert_element(654, 6);
    }

    public static void insert_element(int element, int index)
    {
        int arr[] = {20, 763, 48, 25, 459, 63, 489, 256, 47};
        System.out.print("Old Array:=");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        int arr1[] = new int[arr.length + 1];

        for (int i=0;i<arr1.length;i++)
        {
            if(i<index)
            {
                arr1[i]=arr[i];
            }
            else if (i==index)
            {
                arr1[i]=element;
            }
            else if (i>index)
            {
                arr1[i]=arr[i-1];
            }
        }
        System.out.print("NEW Array:=");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
    }
}