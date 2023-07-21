import java.lang.reflect.Array;
import java.util.Arrays;

public class array_to_string_fun
{
    public static void main(String[] args)
    {
        String a[]={"Amit","Kumar","yadav","manoj ","kumar"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));
        int arr[][]={{12,34},{53,43}};
        System.out.println(Arrays.deepToString(arr));
    }
}
