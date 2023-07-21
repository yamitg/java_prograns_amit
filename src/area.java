import java.util.Scanner;

//        Write a program to print the area of a rectangle by creating a class named 'Area' taking
//        the values of its length and breadth as parameters of its constructor and having a
//        method named 'returnArea' which returns the area of the rectangle. Length and breadth
//        of rectangle are entered through keyboard.
public class area
{
    public  int area1(int l,int b)
    {
        int area=l*b;
        return area;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Length:=");
        int a=sc.nextInt();
        System.out.println("Enter The breadth:=");
        int b=sc.nextInt();

        area myarea=new area();
//        myarea.area1(a,b);
        System.out.println("Area of Rectangle is:="+myarea.area1(a,b));


    }



}
