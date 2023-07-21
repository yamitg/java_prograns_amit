package array_string_class;

import java.util.Scanner;

public class string_02
{
    Scanner sc=new Scanner(System.in);
    public static void reverseString()
    {
        String str="Amit Kumar";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
    public static boolean checkPalindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:= ");
        String str = sc.next();
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            return true;
        }
        return false;
    }

    public static int sumOFString(String str)
    {

        char ch[]=str.toCharArray();
//        String str="a3m4i5t4";
        int sum=0;
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]>='0' && ch[i]<='9' )
            {
                sum=sum+(ch[i]-'0');
            }
//            System.out.print(sum+", ");
        }
        return sum;
    }

    public static int vowels(String str)
    {
        int count =0;
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                count++;
            }
        }
        return count;
    }

    public  static void lowerCase(String str)
    {
        char ch[]=str.toCharArray();
        char newch[]=new char[ch.length];
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]>='A' && ch[i]<='Z')
            {
                newch[i]=(char)(ch[i]+32);
            }
            else
            {
                newch[i]=ch[i];
            }
        }
        String lowercase = new String(newch);
        System.out.println("Lowercase string: " + lowercase);
    }

    public  static void upperCase(String str)
    {
        char ch[]=str.toCharArray();
        char newch[]=new char[ch.length];
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]>='a' && ch[i]<='z')
            {
                newch[i]=(char)(ch[i]-32);
            }
            else
            {
                newch[i]=ch[i];
            }
        }
        String lowercase = new String(newch);
        System.out.println("UPPERCASE string: " + lowercase);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        reverseString();                  // question =1
        // ================================//

//        boolean isPalindrome = checkPalindrome();             // question=2
//        System.out.println(isPalindrome);
//        System.out.print("Enter the String:= ");

        System.out.print("Enter the String:= ");
        String str=sc.next();
        int total=sumOFString(str);
        System.out.println(" ");
        System.out.println("Sum of total numbers:= "+total);

        // ================================//
//        System.out.print("Enter the String:= ");        // question=5
//        String str=sc.next();
//        int total=vowels(str);
//        System.out.println("Total Vowels are present in String:= "+total);

        // ================================//
//        System.out.print("Enter the UPPERCASE String:= ");            // question=6
//        String str=sc.next();
//        lowerCase(str);
        // ================================//
//        System.out.print("Enter the lowercase String:= ");            // question=7
//        String str=sc.next();
//        upperCase(str);

    }
}

