import java.util.Scanner;

public class array_addition
{
    public static void main(String[] args)
    {
        int sum=0;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Array:=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int j=0; j<arr.length; j++)
        {
            System.out.println("Array:= "+arr[j]);
            sum=sum+arr[j];
        }
        System.out.println("Sum of Array:="+sum);
    }
}
