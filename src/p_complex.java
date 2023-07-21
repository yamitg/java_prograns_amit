import java.util.Scanner;

// Print the sum, difference and product of two complex numbers by creating a class
// named 'Complex' with separate methods for each operation whose real and imaginary
// parts are entered by user.
public class p_complex
{
    int a;
    int b;
    public int sum()
    {
        int sum=a+b;
        return sum;
    }
    public int diffrence()
    {
        int diff=a-b;
        return diff;
    }
    public int multiply()
    {
        int mul=a*b;
        return mul;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Real Number:=");
        int n=sc.nextInt();
        System.out.print("Enter The Image Number:=");
        int m=sc.nextInt();
        p_complex c =new p_complex();
        c.a=n;
        c.b=m;

        System.out.println("Sum := "+c.sum());
        System.out.println("Diffrence := "+c.diffrence());
        System.out.println("Subtract := "+c.multiply());

    }

}
