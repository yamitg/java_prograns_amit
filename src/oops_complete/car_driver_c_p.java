package oops_complete;
public class car_driver_c_p
{
    public static void main(String[] args)
    {
        car_c_p c1=new car_c_p("red",520,1000000,new engine_c_p(2500,419,"silver"));
        System.out.println("==============================");
        System.out.println(c1.color);
        System.out.println("==============================");
        System.out.println(c1.speed);
        System.out.println("==============================");
        System.out.println(c1.price);
        System.out.println("==============================");
        c1.display_car();
        System.out.println("==============================");
        c1.e1.start();
        System.out.println("==============================");
        c1.e1.display_engine_c_p();
        System.out.println("==============================");
        c1.display_car();
        System.out.println("==============================");
        System.out.println(c1.e1.hp);
        System.out.println("==============================");
        System.out.println(c1.e1.cc);
        System.out.println("==============================");
        System.out.println(c1.e1.material);
        System.out.println("==============================");
    }




}
