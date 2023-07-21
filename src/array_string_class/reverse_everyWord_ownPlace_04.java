package array_string_class;

public class reverse_everyWord_ownPlace_04
{
    public static void main(String[] args)
    {
//        String str="My name is Amit Kumar";
        String str = "Hello Java Program";
        char ch[] = str.toCharArray();
        String word = "";
        String rev = "";

        for (int i=0;i<ch.length;i++)
        {
            if (ch[i] == ' ')
            {
                int j=i-1;
                while(j>=0 && ch[j] != ' ')
                {
                    rev=rev+ch[j];
                    j--;
                }
                rev= rev+ " ";
            }
        }
        
    }
}
