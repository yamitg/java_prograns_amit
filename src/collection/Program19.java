package collection;
import java.util.*;
public class Program19 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(55);
		l1.add(568);
		l1.add(68);
		l1.add(689);
		l1.add(689);
		l1.add(1, 45);//fast
		System.out.println(l1.get(5));//slow
		
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println("First poll: "+l1.poll());
		System.out.println(l1);
		System.out.println("next Poll: "+l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println("====================");
		System.out.println(l1);
		
		
	}

}
