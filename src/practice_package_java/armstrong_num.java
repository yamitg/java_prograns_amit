package practice_package_java;

public class armstrong_num
{
    public static void main(String[] args)
    {

        int n=500;
        for (int i=1;i<=n;i++)
        {
            int c=i;
            int arm_sum=0;
            while(c>0)
            {
                int rem=c%10;
                int mul=1;
                for (int j = 0; j < 3; j++)
                {
                    mul = mul * rem;
                }
                c = c / 10;
                arm_sum=arm_sum+mul;
            }
            if (arm_sum==i)
            {
                System.out.println("Number is Armstrong Number:= "+i);
            }

        }

    }
}
