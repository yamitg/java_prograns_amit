
import java.util.Scanner;

public class array_ascending_order
{
    public static void main(String[] args)
    {
        int arr[]=new int[5]; int temp=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array:=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array in Ascending Order:=");
        for (int j=0;j<arr.length; j++)
        {
            for (int k=j+1; k<arr.length; k++)
            {
                if (arr[j]>arr[k])
                {
                    //   14,10,20,30,40 .
                    temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[j]+" , ");
        }



    }
}
