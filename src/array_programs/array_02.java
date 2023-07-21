package array_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array_02
{
    public static void main(String[] args)
    {
        String st[]={"Amit","kumar","yadav","khola","family"};
        int arr[]={10,20,30,40,50};
        System.out.println(st.length);
        for(String b:st)
        {
            System.out.println(b+", ");
        }
        System.out.print(Arrays.toString(st)+", ");
        System.out.println("");
        System.out.println(Arrays.toString(arr));

    }
}
