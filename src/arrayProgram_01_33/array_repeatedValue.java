package arrayProgram_01_33;

public class array_repeatedValue
{
    public static void main(String[] args)
    {
        int arr[]={2,45,47,56,3,2,56,34,88,2,356,5,66,88};
        int dup;
        int arr1[]=new int[arr.length];
        int arr2[]=new int[arr.length];
        for (int i=0;i<arr.length ;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    arr1[j]=arr[i];
                }
//                else
//                else if(arr[i]==arr[j])
//                {
//                    arr2[j]=arr[i];
//                }
            }

        }
        System.out.print("First Array list arr1[]:=");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
        System.out.println("");

        System.out.print("Second Array list arr2[]:=");
        for (int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+", ");
        }

    }
}
