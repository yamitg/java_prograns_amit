package java_100_comm_list;

import java.util.Scanner;

public class vowel_consonant
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any character:=");
        char ch=sc.next().charAt(0);

        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            System.out.print("Enter Character is vowel:="+ch);
        }
        else
        {
            System.out.println("Enter Character is consonant:="+ch);
        }

    }
}
