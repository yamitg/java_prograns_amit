package collection;
import java.util.*;
public class Program10 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(56);
		c1.add(88);
		c1.add(62);
		c1.add(77);
		c1.add(90);
		
		Iterator itr=c1.iterator();
		System.out.println(itr.next());//56
		System.out.println(itr.next());//88
		System.out.println(itr.next());//62
		System.out.println(itr.next());//77
		System.out.println(itr.next());//90
//		System.out.println(itr.next());
		
	}

}
