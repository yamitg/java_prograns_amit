public class pattern_C
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n;j++)
            {
//                if (j==0 || j==1 && (i==0 || i==4) || j==2 && i%2!=0 )
                if (j==0 && i!=0 && i!=n-1|| i==0 && j!=0 || i==n-1 && j!=0 )
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
