package oops_java;
//                          Java Inheritance (Subclass and Superclass)
public class vehicle_driver_
{
    public static void main(String[] args)
    {
        car_02 c1=new car_02(720,"Red");
        c1.body="silver";
        c1.price=6378;
        c1.display_all();
        c1.brand="Volvo";
        System.out.println("Vehicle Brand Name:= "+c1.brand);

    }
}
