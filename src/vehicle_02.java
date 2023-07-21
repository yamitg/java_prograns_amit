public class vehicle_02
{
        public static void main(String[] args)
    {
        vehicle_01 v1=new vehicle_01();
        System.out.println(v1.a);
        System.out.println(v1.b);
        System.out.println(v1.c);
//        System.out.println(v1.d);   //  we can not access private in same package but other class.
        v1.test();
        v1.demo();
        v1.root();
//        v1.greet();                   //  we can not access private in same package but other class.
    }
}
