package package_02;
import package_01.*;

public class vehicle_04
{
    public static void main(String[] args)
    {
        vehicle_01 v1=new vehicle_01();
        System.out.println(v1.a);
//        System.out.println(v1.b);     //  we can not access protected in Different package but normal class.
//        System.out.println(v1.c);     //  we can not access Default in Different package but normal class.
//        System.out.println(v1.d);     //  we can not access Private in Different package but normal class.
        v1.test();
//        v1.demo();                    //  we can not access protected in Different package but normal class.
//        v1.root();                    //  we can not access Default in Different package but normal class.
//        v1.greet();                   //  we can not access Private in Different package but normal class.
    }
}
