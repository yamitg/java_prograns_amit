public class vehicle
{

    String name;
    int price;
    String colour;

    public void set_value(String a, int b, String c)
    {
        name = a;
        price = b;
        colour = c;
    }

    public void display() {
        System.out.println("Name:= " + name);
        System.out.println("Price:= " + price);
        System.out.println("Colour:= " + colour);

    }


}
