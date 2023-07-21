package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program8 {
	public static void main(String[] args) {
		Collection<Integer> c1 =new ArrayList<Integer>();
		c1.add(183);
		c1.add(161);
		c1.add(234);
		c1.add(565);
		c1.add(362);
		c1.add(568);
		c1.add(373);
		Collection c2=new ArrayList();
		for(Integer x:c1)
		{
			if(checkpalindrome(x))
			{
				c2.add(x);
			}
		}
		System.out.println(c2);
	}
	public static boolean checkpalindrome(int n)
	{
		int a=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		if(rev==a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}








