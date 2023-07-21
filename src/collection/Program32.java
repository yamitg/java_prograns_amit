package collection;
import java.util.*;
public class Program32 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm1=new LinkedHashMap<Integer, String>();
		hm1.put(2, "mohan");
		hm1.put(3, "john");
		hm1.put(7, "rohan");
		hm1.put(4, "Mac");
		hm1.put(6, "Cat");
		System.out.println(hm1);
		System.out.println("Access all the Keys============");
		System.out.println(hm1.keySet());
		for(Integer x:hm1.keySet())
		{
			System.out.println(x);
		}
		System.out.println("Access all the values=============");
		System.out.println(hm1.values());
		for(String x: hm1.values())
		{
			System.out.println(x);
		}
		System.out.println("===========================");
		System.out.println(hm1.entrySet());
		for(Map.Entry<Integer, String> x:hm1.entrySet())
		{
			System.out.println(x);
		}
		System.out.println("============================");
		for(Map.Entry<Integer, String> x:hm1.entrySet())
		{
			System.out.println("Key is: "+x.getKey()+" Corresponding value is: "+x.getValue());
		}
	
	
	}
	

}











