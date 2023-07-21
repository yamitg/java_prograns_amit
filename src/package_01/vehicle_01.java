package package_01;

public class vehicle_01
{
    public int a=10;
    protected int b=20;
    int c=30;
    private int d=40;

    public void test()
    {
        System.out.println("This is Public TEST Method .");
    }
    protected void demo()
    {
        System.out.println("This is protected DEMO Method .");
    }
    void root()
    {
        System.out.println("This is default ROOT Method .");
    }
    private void greet()
    {
        System.out.println("This is Public GREET Method .");
    }

//    public static void main(String[] args)
//    {
//        vehicle_01 v1=new vehicle_01();
//        System.out.println(v1.a);
//        System.out.println(v1.b);
//        System.out.println(v1.c);
//        System.out.println(v1.d);
//        v1.test();
//        v1.demo();
//        v1.root();
//        v1.greet();
//    }
}
