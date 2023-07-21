package collection_java;

import java.util.ArrayList;
import java.util.Collection;

public class for_loop
{
    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<>();
        c.add(161);
        c.add(211);
        c.add(121);
        c.add(1221);
        c.add(2323);
        c.add(12321);
        c.add(721);
        Collection<Integer> c2 = new ArrayList<>();
        for (Integer y : c)
        {
            if (checkPalindrome(y))
            {
                c2.add(y);
            }
        }
        System.out.print(c2+", ");
    }
        public static boolean checkPalindrome(int z)
        {
            int n=z;
            int rev=0;
            while (n>0)
            {
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
           return rev==z;
        }
    }



// System.out.println(c);
//         int sum=0;
//         for( Integer x:c)
//         {
//         sum=sum+(Integer)x;
//         System.out.print(x+", ");
//         }
//         System.out.println("");
//         System.out.println("Sum := "+sum);