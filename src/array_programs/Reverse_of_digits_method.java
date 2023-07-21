package array_programs;

public class Reverse_of_digits_method
{
    public static void main(String[] args)
    {
        int arr[]={9876,76543,9876,34567,875346,8765,965,45678,4598,7653};
        System.out.println("Arrays length:= "+arr.length);
        int rev[]=new int[arr.length];
        for(int i=0; i<arr.length;i++)
        {
            rev[i]= rev_num(arr[i]);
            System.out.println("Reverse Array List :="+rev[i]+", ");
        }
//        for(int i=0; i<arr.length;i++)
//        {
//            System.out.println("Reverse Array List :="+rev[i]+", ");
//        }
    }

    public static int rev_num(int n)
    {
        System.out.print("Reverse:= ");
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
//        System.out.println(rev+", ");
        return rev;
    }

}
