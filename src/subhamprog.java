public class subhamprog
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++);
        {
//            checkStrong(i);
        }
    }

    public static void checkStrong (int n)
    {
        int a=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            int fact=1;
            for(int j=1;j <=rem;j++);
            {
//                fact=fact*j;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==a)
        {
            System.out.println(a);
        }
    }
}