package collection;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(12);
		c.add(45);
		c.add(56.7);
		c.add(67);
		c.add(67);
		c.add("mohan");
		c.add(45756);
		System.out.println(c);
		Collection c2=new ArrayList();
		c2.add(61);
		c2.add(220);
		c2.addAll(c);
		System.out.println(c2);
		System.out.println(c.contains(61));
		System.out.println(c2.contains(61));
		Collection c3=new ArrayList();
		c3.add(220);
		c3.add(45);
		c3.add(67);
		c3.add(45);
		System.out.println(c.containsAll(c3));
		System.out.println(c2.containsAll(c3));
		System.out.println("=====================");
		System.out.println(c3);
		c3.remove(45);
		System.out.println(c3);
		
		System.out.println(c);
		System.out.println(c2);
		
	}

}













