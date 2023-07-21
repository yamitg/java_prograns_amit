package oops_complete;

public class engine_01
{
    String name;
    int power;
    String material;
    int speed;
    engine_01()
    {

    }
        engine_01(String name)
        {
            this.name=name;
        }
        engine_01(String name,int power)
        {
            this(name);
            this.power=power;
        }
        engine_01(String name,int power,String material)
        {
            this(name,power);
            this.material=material;
        }
        engine_01(String name,int power,String material,int speed)
        {
            this(name, power, material);
            this.speed=speed;
        }
        engine_01(engine_01 x)
        {
            this.name=x.name;
            this.speed= x.speed;
            this.power=x.power;
        }
        public void displayEngine()
        {
            System.out.println("Name of the engine : "+name);
            System.out.println("Power of the engine : "+power);
            System.out.println("Name of the material used: "+material);
            System.out.println("Speed of the engine:="+speed);
        }

}
