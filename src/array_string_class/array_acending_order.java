package array_string_class;

public class array_acending_order
{
    public static void main(String[] args)
    {
        int arr[]={31,24,15,4,5,88,5,45,6,23,5,21,5};
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
//                    System.out.println(arr[i]);
//                    System.out.println(arr[j]);
//                    System.out.println("=============");
                }
            }
            System.out.print(arr[i]+", ");
        }
       // System.out.println(" ");
        //for (int k=0;k<arr.length;k++)
//        {
//            System.out.print(arr[k]+", ");
//        }

    }
}
