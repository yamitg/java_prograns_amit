package daily_5_program_Register.date_08_07_2023;

public class wordCount
{
    public static void main(String[] args)
    {
        String str="hye, my name is Amit Yadav";
        char ch[]=str.toCharArray();
        int count;
        if (str.length()==0)
        {
            count=0;
            System.out.println("String is Empty");
        }
        else
        {
            count =1;
            for (int i = 0; i < ch.length; i++)
            {
                if (ch[i] == ' ')
                {
                    count++;
                }
            }
        }
        System.out.println("There are \""+count+"\" words in String:");
    }


}
