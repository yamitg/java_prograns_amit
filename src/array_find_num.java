import java.util.Scanner;

public class array_find_num
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array:=");
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int j=0; j<arr.length;j++)
        {
            System.out.println("Array:=" + arr[j]);
        }
        System.out.print("Enter the number:=");
        int n=sc.nextInt();
        for (int k=0; k<arr.length;k++)
        {
            if (arr[k]==n)
            {
                count++;
            }
        }
        System.out.println("How many Times A number In the array Repeat:="+count);
        if (count>0)
        {
            System.out.println("The given Number is in Array:="+n);
        }
        else
        {
            System.out.println("Number is not in Array");
        }

    }
}
