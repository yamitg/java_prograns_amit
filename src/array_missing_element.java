import java.util.Scanner;

public class array_missing_element
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:=");
        for (int i=0;i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<arr.length-1;i++)
        {
            for (int j=arr[i]+1; j<arr[i+1];j++)
            {
                System.out.print(j+" , ");
            }
        }

    }
}
