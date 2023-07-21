import java.util.Scanner;

public class array_search_item
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array items:= ");
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array:=");
        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+", ");
        }
        System.out.print("Enter search Item:= ");
        int n=sc.nextInt();
        System.out.print("Search item is found:=");
        for (int k=0;k<arr.length;k++)
        {
            if(arr[k]==n)
            {
                count++;
                System.out.println(arr[k]);
            }
        }
        System.out.println("HOw MUch times number is percent :="+count);
    }
}
