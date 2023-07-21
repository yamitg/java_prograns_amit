package collection;
import java.util.*;
public class Program9 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(56);
		c1.add(88);
		c1.add(62);
		c1.add(77);
		c1.add(90);
		
		Iterator itr=c1.iterator();
		
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
	}

}
