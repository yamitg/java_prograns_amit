package array_programs;

public class array_character_frequency
{
    public static void main(String[] args)
    {
        char ch[]={'a','b','c','d','e','a','a','c','c'};
        int character='a';
        int count=0;
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]==character)
            {
                count++;
            }
        }
        System.out.println(character+":= "+count);

    }
}
