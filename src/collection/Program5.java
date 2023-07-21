package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program5 {
	public static void main(String[] args) {
		Collection c1 =new ArrayList();
		c1.add(12);
		c1.add(45);
		c1.add(56.7);
		c1.add("Mohan is happy");
		c1.add(120);
		c1.add(340);
		System.out.println("Access through for each loop===================");
		for(Object x:c1)
		{
			System.out.println(x);
		}
		System.out.println("Access through for each loop===================");
		for(Object x:c1)
		{
			System.out.println(x);
		}
		System.out.println("Access through for each loop===================");
		for(Object x:c1)
		{
			System.out.println(x);
		}
	}

}
