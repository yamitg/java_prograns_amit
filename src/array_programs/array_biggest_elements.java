package array_programs;

public class array_biggest_elements
{
    public static void main(String[] args)
    {
//        int arr[] = {10, 2, 30, 66, 0, 61, 70, 8, 94, 19};
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        int big=0;
//        for (int i=0;i<arr.length;i++)
//        {
//            if (arr[i]>big)
//            {
//                big=arr[i];
//            }
//        }
//        System.out.println("Biggest array number:="+big);


//        //          Smallest Number Array:=

        int arr[] = {10, 2, 30, 66, 1, 61, 70, 8, 94, 19};
        int min=arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Number In array:="+min);





    }
}



