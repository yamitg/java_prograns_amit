package array_programs;

public class largest_num
{
    public static void main(String[] args)
    {
        int arr[]={34,356,256,765,345,7654,45,765,653,654,846};
        int big=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>big)
            {
                big=arr[i];
            }
        }
        System.out.print("Largest Number is:="+big);
    }
}
