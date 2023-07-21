public class array_2D_01
{
    public static void main(String[] args)
    {
        int arr[][]={{20,30,40},{11,40,10}};
        System.out.println(arr.length);
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" , ");
            }
            System.out.println();
        }
    }

}
