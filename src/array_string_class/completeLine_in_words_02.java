package array_string_class;

public class completeLine_in_words_02
{
    public static void main(String[] args)
    {
        String str="My Name is AMit Kumar";
        char ch[]=str.toCharArray();

        String word="";
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]==' ')
            {
                System.out.println(word);
                word="";
            }
            else
            {
                word=word+ch[i];
            }
        }
        System.out.println(word);
    }
}
