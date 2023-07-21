package collection;

import java.util.Arrays;

public class Program33 {
	public static void main(String[] args) {
		int[] a= {35, 547, 346, 349, 32, 36, 233};
		System.out.println("Unsorted Array===================");
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println("Sorted Array=====================");
		Arrays.sort(a);
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
