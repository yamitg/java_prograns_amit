import java.util.Scanner;

public class array_average
{
    public static void main(String[] args)
    {
        int sum=0; double avg;
        int arr[]=new int[3];
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
        avg=(sum)/5.0;
        System.out.println("Average of array:="+avg);

    }

}
