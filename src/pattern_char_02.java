public class pattern_char_02
{
    public static void main(String[] args)
    {
        int n=10;
        for (int i=0; i<n; i++)
        {
            char c='A';
            for(int j=0; j<n; j++)
            {
//                if(i>=j && i+j>=n-1 || i+j<=n-1 && i<=j  )
//                if(i>=j && i+j<=n-1 || i<=j&& i+j>=n-1)
                if(i>=j )
                {
                    System.out.print(c++ +"  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
