import java.util.Scanner;

public class array_duplicate_02
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int temp[]=new int[arr.length];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:=");
        for (int i=0;i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<arr.length;i++)
        {
            int count=1;
            for (int j=i+1; j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    temp[j]=-1;
                }
            }
            if(temp[i]!=-1)
            {
                System.out.println(arr[i]+" , "+count);
            }
        }



    }



}
