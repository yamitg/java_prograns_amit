package oops_complete;

public class engine_c_p
{
    int cc;
    int hp;
    String material;

    engine_c_p()
    {

    }

    engine_c_p(int cc,int hp,String material)
    {
        this.cc=cc;
        this.hp=hp;
        this.material=material;
    }
    public void start()
    {
        System.out.println("Start the engine .");
    }

    public void display_engine_c_p()
    {
        System.out.println(" Engine has a cc"+cc);
        System.out.println(" Engine has a hp"+hp);
        System.out.println(" Engine has used material "+material);
        start();
    }






}
