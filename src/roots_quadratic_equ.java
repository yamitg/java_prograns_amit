import java.util.Scanner;
public class roots_quadratic_equ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'a':=");
        int a=sc.nextInt();
        System.out.println("Enter the value of 'b':=");
        int b=sc.nextInt();
        System.out.println("Enter the value of 'c':=");
        int c=sc.nextInt();

        int d=b*b-4*a*c;
        if(d>=0)
        {
            System.out.println("Real roots are possible:=");
            double p = (-b+ Math.sqrt(d)/(2*a));
            double q = (-b- Math.sqrt(d)/(2*a));
            System.out.println("Ist Root is:="+p);
            System.out.println("2nd Root is:="+q);
        }
        else
        {
            System.out.println("Roots are not Real(Imaginary Roots) ");
        }

    }
}

