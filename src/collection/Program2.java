package collection;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(12);
		c.add(45);
		c.add(56.7);
		c.add(67);
		c.add("mohan");
		c.add(45756);
		Collection c2=new ArrayList();
		c2.add(61);
		c2.add(220);
		c2.addAll(c);
		System.out.println(c2);
		Collection c3=new ArrayList();
		c3.add(220);
		c3.add(45);
		c3.add(67);
		c3.add(4);
		c2.removeAll(c3);
		System.out.println(c2);
	}

}
