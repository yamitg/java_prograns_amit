public class practice_pattern
{
    public static void main(String[] args)
    {
        triangle(7);
//        System.out.println("==================================");
//        right_tri(5);

    }

    public static void right_tri(int n)
    {
////        int n=5;
        for (int i=0; i<n;i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void triangle(int n)
    {
//        int n=7;
        for (int i=0; i<n;i++)
        {
            for (int j = 7; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
//        System.out.println("==================");


        for(int i=0;i<n;i++)
        {
            for (int j=0; j<=i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=7;k>i;k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
