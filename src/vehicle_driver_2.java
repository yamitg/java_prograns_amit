public class vehicle_driver_2
{
    public static void main(String[] args)
    {
        vehicle v1=new vehicle();
        v1.set_value("Bike",91000,"white");
        v1.display();
        System.out.println("============================");
        vehicle v2=new vehicle();
        v2.set_value("Tractor",891000,"Blue");
        v2.display();
        System.out.println("============================");
        vehicle v3=new vehicle();
        v3.set_value("Aeroplane",1091000,"Skyblue");
        v3.display();
        System.out.println("============================");

    }

}
