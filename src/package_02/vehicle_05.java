package package_02;
import package_01.*;
public class vehicle_05 extends vehicle_01
{
    public static void main(String[] args)
    {
        vehicle_05 v1=new vehicle_05();
        System.out.println(v1.a);
        System.out.println(v1.b);
//        System.out.println(v1.c);     //  we can not access Default in Different package but child class.
//        System.out.println(v1.d);     //  we can not access Private in Different package but child class.
        v1.test();
        v1.demo();
//        v1.root();                    //  we can not access Default in Different package but child class.
//        v1.greet();                   //  we can not access Private in Different package but child class.
    }
}
