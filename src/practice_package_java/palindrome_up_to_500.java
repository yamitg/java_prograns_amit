package practice_package_java;
public class palindrome_up_to_500
{
    public static void main(String[] args)
    {
        int n=500;
        System.out.print(" Palindrome number up to 100:= ");
        for (int i=2;i<=n;i++)
        {
            int c=i;
            int rev=0;
            int rem=0;
            while(c>0)
            {
                rem = c % 10;
                rev = rev*10+ rem;
                c=c/10;
            }
            if (i==rev)
            {
                System.out.print(rev+", ");
            }

        }

    }
}
