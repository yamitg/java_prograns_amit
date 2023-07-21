package oops_complete.areaOfcircle;

public class areaOfCircle
{
    double pi=3.14;
    double areaOfCircle(int number)
    {
        square s1=new square();
       int squareResult= s1.squareForCircle(number);
        return pi*squareResult;
    }
}
