
public class laptop
{
    String name;
    int price;
    String company;
    public laptop()
    {

    }
    public laptop(String n, int p, String c)
    {
        name= n;
        price=p;
        company=c;
    }
    public void set_value(String n, int p, String c)
    {
        name=n;
        price=p;
        company=c;
    }
    public void display()
    {
        System.out.println("Name:= "+name);
        System.out.println("Price:= "+price);
        System.out.println("Company:= "+company);
        System.out.println("=========================================");

    }

}

