import java.util.Scanner;

public class array_descending_order
{
    public static void main(String[] args)
    {
        int arr[]=new int[5]; int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array in Descending Order:=");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
//              14,10,20,30,40 .
                if (arr[i]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(arr[i]+" , ");
        }

    }
}
