import java.util.Scanner;

public class array_05_reverse
{
    public static void main(String[] args)
    {
        int arr[]=new int[3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array element:=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<arr.length; j++)
        {
            System.out.println("Array(Before Reverse) :="+arr[j]+" , Length:="+arr.length);
        }
        for (int k=arr.length-1; k>=0; k--)
        {
            System.out.println("Array(After Reverse) :="+arr[k]);
        }
    }
}
