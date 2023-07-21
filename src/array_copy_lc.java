import java.util.Scanner;

public class array_copy_lc
{
    public static void main(String[] args)
    {
        int arr1[] = {10, 200, 30, 66, 0, 61, 70, 8, 90, 19};
        int arr2[] = new int[10];
        int sum=0; int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Arr1 Array List:=");
        for (int i = 0; i < arr1.length; i++)
        {
//            System.out.println(arr1[i] + ", ");
            for (int l=i+1;l<arr1.length;l++)
            {
                if (arr1[i]>arr1[l])
                {
                    temp =arr1[i];
                    arr1[i]=arr1[l];
                    arr1[l]=temp;
                }
            }

        }
        for (int i=0;i< arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
        System.out.print("Enter the number for searching:=");
        int n=sc.nextInt();
        for (int j = 0; j < arr1.length; j++)
        {
            arr2[j] = arr1[j];
            System.out.print(arr2[j] + ", ");
            sum=sum+arr2[j];

            if (arr1[j]==n)
            {
                System.out.println("Enter number in array list:="+n);
            }
        }
        System.out.println("Sum:="+sum);
    }
}
