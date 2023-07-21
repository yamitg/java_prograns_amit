package oops_complete;

public class car_c_p
{
    String color;
    int speed;
    double price;
    car_c_p()
    {

    }
    engine_c_p e1=new engine_c_p(1000,720,"iron");
    car_c_p(String color,int speed,double price,engine_c_p e1)
    {
        this.color=color;
        this.speed=speed;
        this.price=price;
        this.e1=e1;
    }

    public void display_car()
    {
        System.out.println("car has a colour:= "+color );
        System.out.println("car has a speed:= "+speed );
        System.out.println("car has a price := "+price );
        e1.display_engine_c_p();
        System.out.println(e1.hp);
        System.out.println(e1.cc);
        System.out.println(e1.material);
        e1.start();
    }

}
