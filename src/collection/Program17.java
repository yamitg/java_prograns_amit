package collection;
import java.util.*;
public class Program17 {
	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(81);
		c1.add(45);
		c1.add(2);
		c1.add(45);
		c1.add(35);
		
		ListIterator it=c1.listIterator();
		System.out.println("Access in forward direction:============");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Access in backward direction:============");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
