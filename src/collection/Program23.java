package collection;
import java.util.*;
public class Program23 {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(12);
		c.add(45);
		c.add(56.7);
		c.add(67);
		c.add(67);
		c.add(12);
		c.add("Mohan");
		c.add(45756);
		c.add(45);
		System.out.println("===========================");
		System.out.println(c);
		LinkedHashSet hs2=new LinkedHashSet(c);
		System.out.println(hs2);
	}

}
