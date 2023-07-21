package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program4 {
	public static void main(String[] args) {
		Collection c1 =new ArrayList();
		c1.add(12);
		c1.add(45);
		c1.add(56.7);
		Collection c2=new ArrayList();
		c2.add(61);
		c2.add(220);
		Collection c3=new ArrayList();
		c3.add(68);
		c3.add(223);
		Collection c4=new ArrayList();
		c4.add(610);
		c4.add(245);
		Collection c5=new ArrayList();
		c5.addAll(c1);
		c5.addAll(c2);
		c5.addAll(c3);
		c5.addAll(c4);
		System.out.println(c5);
		c5.clear();
		System.out.println(c5);
	}

}
