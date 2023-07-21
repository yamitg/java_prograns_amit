package array_string_class;

public class reverseString_withActual_name_03
{
    public static void main(String[] args)
    {
        String str="My name is Amit Kumar";

        char ch[]=str.toCharArray();
        String word="";
        String rev="";
        for (int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                rev=" "+word+rev;
                word="";
            }
            else
            {
                word=word+ch[i];
            }
        }
        rev=word+rev;
        System.out.println(rev);
    }
}
