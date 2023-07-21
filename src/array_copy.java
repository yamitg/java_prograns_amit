import java.util.Scanner;

public class array_copy
{
    public static void main(String[] args)
    {
        int arr[]=new int[3];
        int arrb[]=new int[3];
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the array :=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int j=0; j<arr.length; j++)
        {
            System.out.println("First Array:="+arr[j]);
        }
        for (int k=0;k<arr.length; k++)
        {
            arrb[k]=arr[k];
            System.out.println("Coped Array:="+arrb[k]);
        }

    }
}
