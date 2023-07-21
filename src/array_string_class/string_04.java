package array_string_class;

public class string_04
{
    public static void main(String[] args)
    {
        String str="hello % & jav 6*2 1 11 7 5 class";
        char ch[]=str.toCharArray();
        int pro=1;
        for (int i=0;i<ch.length;i++)
        {
//            System.out.println(ch[i]-'0');
            if (ch[i]>='0' && ch[i]<='9')
            {
                int num=ch[i]-'0';
                int count=0;
                for (int j=2;j<=num/2;j++)
                {
                    if (num%j==0)
                    {
                        count++;
                    }
                }
                if (count==0)
                {
                    pro=pro*num;
                }
            }
        }
        System.out.println("Product:= "+pro);
    }
}
