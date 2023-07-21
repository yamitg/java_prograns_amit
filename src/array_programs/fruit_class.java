package array_programs;

public class fruit_class
{
        String name="Apple";
        int price;
        String color;
        int kg;
        fruit_class()
        {

        }
//        fruit_class(String name,int price,String color,int kg)        Array drive class parameters only
        fruit_class(int price,String color,int kg)
        {
//            this.name=name;                                           Array drive class parameters only
            this.price=price;
            this.color=color;
            this.kg=kg;
        }

        public void display_details()
        {
            System.out.print("Fruit Name:="+name);
            System.out.print(", Fruit price:="+price);
            System.out.print(", Fruit color:="+color);
            System.out.println(", Fruit kg:="+kg);
            System.out.println("====================================");
        }


}
