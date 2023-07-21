package daily_5_program_Register.date_08_07_2023;

// Each word's characters reversed while maintaining their original position.

public class reverseWordItsPosition
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
                int j=i-1;
                while(j>=0 && ch[j]!=' ')
                {
                    rev=rev+ch[j];
                    j--;
                }
                rev=rev+" ";
            }
        }

        int j=ch.length-1;
        while(j>=0 && ch[j]!=' ')
        {
            rev=rev+ch[j];
            j--;
        }
//        rev=rev+" ";
        System.out.println(str);
        System.out.println(rev);
    }
}
