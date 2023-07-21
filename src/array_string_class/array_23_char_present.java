package array_string_class;

import java.util.Scanner;

public class array_23_char_present
{
    public static void main(String[] args)
    {
        char arr[] = {'m', 'i', 't', 'k', 'u', 'm', 'r', 'y', 'a', 'd', 'a', 'v'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:= ");
        char ch = sc.next().charAt(0);
        boolean result=check_char(arr,ch);
        System.out.println("Result:= "+result);
    }

    public static boolean check_char(char arr[],char ch)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==ch)
            {
                return true;
            }
        }
        return false;
    }
}
