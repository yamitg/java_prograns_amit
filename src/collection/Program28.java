package collection;
import java.util.*;
public class Program28 {
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(34);
		a.add(56);
		a.add(67);
		a.add(100);
		a.add(120);
		System.out.println(a);
		a.addFirst(200);
		a.addFirst(300);
		a.addLast(400);
		a.addLast(500);
		System.out.println(a);
		System.out.println("============");
		a.remove();
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		
	}

}
