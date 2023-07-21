package collection;
import java.util.*;
public class Program27 {
	public static void main(String[] args) {
		Queue l1=new LinkedList();
		l1.add(34);
		l1.add(56);
		l1.add(67);
		l1.add(100);
		System.out.println(l1);
		
		l1.remove();
		System.out.println(l1);
		l1.remove();
		System.out.println(l1);
	}

}
