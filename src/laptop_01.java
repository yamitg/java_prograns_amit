public class laptop_01
{
    public static void main(String[] args)
    {
        laptop l1=new laptop();
        l1.set_value("core i5",72000,"HP");
        l1.display();


        laptop l2=new laptop();
        l2.set_value("core i7",92000,"Dell");
        l2.display();


        laptop l3=new laptop();
        l3.set_value("core i9",172000,"Asus");
        l3.display();

        laptop l4=new laptop("core i11",200000,"lenovo");
        l4.display();
    }
}
