import java.util.Scanner;

public class naturalnumber
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int i=1;
        int sum=0;
        int n=100;
        while(i<=n)
        {
            sum=sum+i*i*i;
            i++;
        }
        System.out.println("The Sum is:="+sum);
    }
}
