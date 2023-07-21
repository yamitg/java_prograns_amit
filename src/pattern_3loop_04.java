public class pattern_3loop_04
{

    public static void main(String[] args)
    {
        int n=5;
        for (int i=0; i<n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print("@");
            }
            int number=1;
            for(int k=0;k<=i;k++)
            {
                System.out.print(number+" ");
                number=number*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
