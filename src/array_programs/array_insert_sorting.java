package array_programs;

public class array_insert_sorting
{
    public static void main(String[] args)
    {
        int arr[]={20,53,86,36,57,97};

        int arr1[]=new int[arr.length+1];

        System.out.print("Old Array:=");
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+", ");
        }
        int element=65;
        int index=4;
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
        System.out.println(" ");
        System.out.print("New Array:=");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
    }

}
