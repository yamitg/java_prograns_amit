package array_string_class;

import java.util.Scanner;

public class print_a_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String ch="Amit Kumar";
        System.out.println(ch);
        for (int i=0;i<ch.length();i++)
        {
//             if (ch.charAt(i)>='A' && ch.charAt(i)<='Z' || ch.charAt(i)>='a' && ch.charAt(i)<='z' )
            if (ch.charAt(i)!=' ')
            {
                System.out.println(ch.charAt(i));
            }
        }

    }
}
