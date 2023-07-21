package arrayProgram_01_33;

public class array_minNumber_01
{
    public static void main(String[] args)
    {
        int arr[]={73,48,3,57,346,81,18,38,276,93,63};
        int min=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Number in given Array:="+min);
    }
}
