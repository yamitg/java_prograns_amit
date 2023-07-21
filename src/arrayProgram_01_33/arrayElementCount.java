package arrayProgram_01_33;

public class arrayElementCount
{
    public static void main(String[] args)
    {
        int arr[]= {10,123,1203,823,3};

        for (int i=0;i<arr.length;i++)
        {
            int count=0;
            int n=arr[i];
            while (n>0)
            {
                int rem=n%10;
                count++;
                n=n/10;
            }
            System.out.println("The Element "+arr[i]+" is := "+count+" times in Array");
        }
    }
}
