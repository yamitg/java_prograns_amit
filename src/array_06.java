import java.util.Scanner;

public class array_06
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
            System.out.println("Array:="+arr[j]+" , Length:="+arr.length);
        }
    }
}
