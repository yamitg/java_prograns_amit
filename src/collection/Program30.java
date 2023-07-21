package collection;
import java.util.*;
public class Program30 {
	public static void main(String[] args) {
		LinkedHashMap hm1=new LinkedHashMap();
		hm1.put(2, "mohan");
		hm1.put(3.5, "john");
		hm1.put("abac", 56);
		hm1.put(4, "Mac");
		hm1.put(6, "Cat");
		System.out.println(hm1);
		hm1.put(4, "Jack");
		System.out.println(hm1);
	}

}
