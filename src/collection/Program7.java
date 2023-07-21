package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program7 {
	public static void main(String[] args) {
		Collection<Integer> c1 =new ArrayList<Integer>();
		c1.add(12);
		c1.add(45);
		c1.add(45);
		c1.add(55);
		c1.add(340);
		int sum=0;
		for(Integer x:c1)
		{
			if(x%2==0)
			{
				System.out.print(x+", ");
				sum=sum+x;
			}
		}
		System.out.println("The Sum is: "+sum);
	}

}
