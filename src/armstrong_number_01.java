public class armstrong_number_01
{
    public static void main(String[] args)
    {
        int n=500;

        for (int j=1;j<=n;j++)
        {
            int c=j;
            int sum=0;
            while(c>0)
            {
               int rem=c%10;
                int str=1;
                for (int i=0;i<3;i++)
                {
                    str=str*rem;
                }
                sum=sum+str;
                c=c/10;
            }
//            System.out.println("Sum:="+sum);
            if (j==sum)
            {
                System.out.println("Enter Number is Armstrong Number:="+j);
            }
        }

    }
}
