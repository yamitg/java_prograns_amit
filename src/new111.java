import java.util.Scanner;
public class new111
    {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);


////      Question: 1= W.A.J.P to print of factorial of each digit of a number enter.
////      Answer:=
                System.out.println("Enter the Number: ");
                int x=sc.nextInt();
                int sum=0;
                while(x>0)
                {
                    int rem=x%10;
                    int fact=1;
                    int n=rem;
                    int j=1;
                    while(j<=n)
                    {
                        fact=fact*j;
                        j++;
                    }
                    System.out.println(n+"!= "+fact);
                    sum=sum+fact;
                    System.out.println("Sum of each digit of factorial:="+sum);
                    x=x/10;
                }
            }

          }