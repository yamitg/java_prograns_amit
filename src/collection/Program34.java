package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Program34 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(67);
		a1.add(78);
		a1.add(21);
		a1.add(13);
		a1.add(78);
		
		System.out.println("Unsotred arraylist==================");
		System.out.println(a1);
		System.out.println("Sorted arraylist=============");
		Collections.sort(a1);
		System.out.println(a1);
	}

}
