package collection;
import java.util.ArrayList;
import java.util.List;

public class Program18 {
	public static void main(String[] args) {
		List c1=new ArrayList(10000);
		c1.add(81);
		c1.add(45);
		c1.add(2);
		c1.add(45);

		System.out.println(c1.size());

		List l2=new ArrayList(c1);
		System.out.println(l2);

		List l3=new ArrayList(100000);
		System.out.println(l3);


	}

}
