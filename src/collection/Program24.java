package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Program24 {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(12);
		c.add(45);
		c.add(56);
		c.add(67);
		c.add(67);
		c.add(12);
		c.add(45);
		c.add(45756);
		c.add(45);
		System.out.println("===========================");
		System.out.println(c);
		TreeSet hs2=new TreeSet(c);
		System.out.println(hs2);
	}

}
