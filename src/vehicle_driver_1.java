public class vehicle_driver_1
{
    public static void main(String[] args)
    {
        vehicle v1 = new vehicle();
        v1.name="Bike";
        v1.price=91000;
        v1.colour="White";
        System.out.println("Name:= "+v1.name);
        System.out.println("Price:= "+v1.price);
        System.out.println("Colour:= "+v1.colour);

        System.out.println("====================================");

        vehicle v2 = new vehicle();
        v2.name="Tractor";
        v2.price=891000;
        v2.colour="Blue";
        System.out.println("Name:= "+v2.name);
        System.out.println("Price:= "+v2.price);
        System.out.println("Colour:= "+v2.colour);

        System.out.println("====================================");

        vehicle v3 = new vehicle();
        v3.name="Aeroplane";
        v3.price=10891000;
        v3.colour="SkyBlue";
        System.out.println("Name:= "+v3.name);
        System.out.println("Price:= "+v3.price);
        System.out.println("Colour:= "+v3.colour);

    }
}
