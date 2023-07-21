package array_string_class;

public class prime_num_find
{
    public static int checkPrime(char ch[])
    {
        int pro=1;
        for (int i=0;i<ch.length;i++)
        {
            int count=0;
            if (ch[i]>=48 && ch[i]<=57)
            {
                int num=ch[i]-48;
                for (int j=2;j<num/2;j++)
                {
                    if (num%j==0)
                    {
//                        System.out.println(num);
                        count++;
                    }
                }
                if(count==0)
                {
                    pro=pro* num;
                }
            }
        }
        return pro;
    }


    public static void main(String[] args)
    {
        String str="hello % & jav 6*2 1 11 7 5 class";
        char ch[]=str.toCharArray();
        int result=checkPrime(ch);
        System.out.println("Product of All prime number:= "+result);

    }
}
