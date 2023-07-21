package oops_java;
//                          Java Inheritance (Subclass and Superclass)

public class car_02 extends Vehicle_01_
{
    static  String colour;
    int engine_h_power;

    car_02(int engine_h_power,String colour)
    {
        this.engine_h_power=engine_h_power;
        this.colour=colour;
    }

    public void display_all()
    {
        System.out.println("Car Colour:= "+car_02.colour);
        System.out.println("Body Type:= "+body);
        System.out.println("Body Price:= "+price);
    }
}
