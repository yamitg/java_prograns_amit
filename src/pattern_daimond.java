public class pattern_daimond
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j<=1 || i-j>=3 || i+j>=7 || j-i>=3)
                {
                    System.out.print("*  ");
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
