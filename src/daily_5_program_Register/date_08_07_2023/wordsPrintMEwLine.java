package daily_5_program_Register.date_08_07_2023;

public class wordsPrintMEwLine
{
    public static void main(String[] args)
    {
        String str="hye, my name is Amit Yadav";
        char ch[]=str.toCharArray();
        int count;
        String word="";
        String rev="";
        for(int i=0;i<ch.length;i++)
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
