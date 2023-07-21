package array_string_class;

public class stringReverse
{
    public static void main(String[] args)
    {
        String str="Hellow World";
       String s1 []=str.split(" ");
       for(String s2:s1)
       {
           char ch[]=s2.toCharArray();
           for(int i = ch.length-1;i>=0;i--)
           {
               System.out.print(ch[i]);
           }
           System.out.print(" ");
       }
    }
}
