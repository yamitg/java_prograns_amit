package array_string_class;

public class reverse_everyWord_ownPlace
{
    public static void main(String[] args)
    {
//        String str="My name is Amit Kumar";
        String str="Hello Java Program";
        char ch[]=str.toCharArray();
        String word="";
        String rev="";
        String rev1="";
        String str1="";
        for (int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                str1=word;
                char ch1[]=str1.toCharArray();
                for (int j=ch1.length-1;j>=0;j--)
                {
                    rev1=rev1+ch1[j];
//                  System.out.println(rev1);
                    word="";
                }
                rev=rev+rev1;
                System.out.println(rev);
            }
            else
            {
                word=word+ch[i];
            }
        }
    }
}
