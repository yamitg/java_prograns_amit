package collection;
import java.util.*;

public class Program12 {
	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		System.out.println(c1.isEmpty());
		System.out.println("Hash code: "+c1.hashCode());
		c1.add(56);
		c1.add(88);
		c1.add(61);
		c1.add(77);
		c1.add(90);
		c1.add(67);
		System.out.println(c1);
		System.out.println("hash code: "+c1.hashCode());
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		Iterator<Integer> itr=c1.iterator();
		
		System.out.println("Even Elements===================");
		while(itr.hasNext())
		{
			int x=itr.next();
			if(x%2==0)
			{
				System.out.println(x);
			}
		}
	}

}
