package array_programs;

public class Reverse_of_digits
{
    public static void main(String[] args)
    {
        int arr[]={9876,76543,9876,34567,875346,8765,965,45678,4598,7653};
        System.out.println(arr.length);
        int rev=0;
        for (int i=0;i<arr.length;i++)
        {
            int rem=0;
            System.out.println("Reversed Array list:= ");
            for (int j=i;j<arr.length;j++)

            rem=arr[j]%10;
            rev=rev*10+rem;
            arr[0]=arr[0]/10;
        }
            System.out.print(rev+", ");
    }
}
