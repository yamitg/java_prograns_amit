package collection;
import java.util.*;
public class Program21 {
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(12);
		c.add(45);
		c.add(56.7);
		c.add(67);
		c.add(67);
		c.add(12);
		c.add(45756);
		c.add(45);
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(56);
		hs1.add(32);
		hs1.add(54);
		hs1.add(56);
		hs1.add(64);
		hs1.add(12);
		
		System.out.println("======Access the elements==========");
		for(Object x:hs1)
		{
			System.out.println(x);
		}
		System.out.println("===========================");
		System.out.println(c);
		HashSet hs2=new HashSet(c);
		System.out.println(hs2);
	}

}












