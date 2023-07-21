public class retrun_type
{
    public static void main(String[] args)
    {
        int x=(factorial(5)+10);
        System.out.println(x+20);
    }


    public static int factorial(int n)
    {
//        int n=5;
        int fact=1;
        for (int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
//        System.out.println(n+"! ="+fact);
        return fact;
    }

}
