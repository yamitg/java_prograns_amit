package collection;
import java.util.*;
public class Program20 {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(12);
		s1.push(34);
		s1.push(32);
		s1.push(45);
		System.out.println(s1);
		System.out.println(s1.search(100));
		System.out.println(s1.search(230));
		System.out.println(s1.search(34));
		System.out.println(s1.search(45));
		System.out.println(s1.search(12));
		
	}

}
