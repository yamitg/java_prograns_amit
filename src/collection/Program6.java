package collection;

import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		Collection c1 =new ArrayList();
		c1.add(12);
		c1.add(45);
//		c1.add("mohan");
		c1.add(55);
		c1.add(340);
		int sum=0;
		for(Object x:c1)
		{
			sum=sum+(Integer)x;
		}
		System.out.println("The Sum is: "+sum);
	}

}
