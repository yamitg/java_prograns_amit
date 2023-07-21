package daily_5_program_Register.date_08_07_2023;

public class reverseTheString
{
    public static void main(String[] args)
    {
        String str="hye, my name is Amit Yadav";
        char ch[]=str.toCharArray();
        int count;
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
