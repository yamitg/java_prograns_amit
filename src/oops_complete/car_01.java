package oops_complete;

public class car_01
{
    public static void main(String[] args)
    {
        System.out.println("============e1================");
        engine_01 e1=new engine_01("ranger");
        e1.displayEngine();
        System.out.println("==============e2=============");
        engine_01 e2=new engine_01("ranger",1500);
        e2.displayEngine();
        System.out.println("============e3================");
        engine_01 e3=new engine_01("ranger",1500,"Silver");
        e3.displayEngine();
        System.out.println("==============e4=============");
        engine_01 e4=new engine_01("Hour",1100,"plastic",420);
        e4.displayEngine();
        System.out.println("==============e2=============");
        engine_01 e5=new engine_01(e2);
        e5.displayEngine();


    }

}
