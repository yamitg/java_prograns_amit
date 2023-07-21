package collection;
import java.util.*;
public class EmployDriver
{
	public static void main(String[] args)
	{
		Employ e1=new Employ("mohan", 234, 34657.45);
		Employ e2=new Employ("sohan", 231, 44657.45);
		Employ e3=new Employ("jagmohan", 230, 44657.45);
		Employ e4=new Employ("macmohan", 253, 4657.45);
		Employ e5=new Employ("chnadramohan", 246, 54657.45);
		//System.out.println(e1);
		ArrayList<Employ> a1=new ArrayList<Employ>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		System.out.println("Unsorted data is: ===================");
		for(Employ x:a1)
			{
				System.out.println(x);
			}
		System.out.println("==Sorted data ======================");

		Collections.sort(a1);

		for(Employ x:a1)
			{
				System.out.println(x);
			}
		
	}

}












