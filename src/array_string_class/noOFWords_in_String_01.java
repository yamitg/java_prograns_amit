package array_string_class;

public class noOFWords_in_String_01
{
        public static void main(String[] args)
        {
            String str="My name is Amit Kumar";
            char ch[]=str.toCharArray();
            int count =1;
            for (int i=0;i<ch.length;i++)
            {
                if(ch[i]==' ')
                {
                    count++;
                }
            }
            System.out.println("No Of Words:="+count);
        }
}
