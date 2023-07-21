package collection_java;

import java.util.ArrayList;
import java.util.Collection;

public class collection_01
{
    public static void main(String[] args)
    {

        Collection c1=new ArrayList();
        c1.add(11);
        c1.add(12);
        c1.add("Amit yadav");
        c1.add(13.55);
        c1.add(14);
        c1.add(15);
        c1.add(16);
        System.out.println(c1);

        Collection c2=new ArrayList();
        c2.add(21);
        c2.add(22);
        c2.add(23);
        c2.addAll(c1);
        System.out.println(c2);

        Collection c3=new ArrayList();
        c3.add(31);
        c3.add(32);
        c3.add(33);
        c3.add(34);
        c3.add(35);
        c3.addAll(c2);
//        c3.addAll(c1);
        System.out.println(c3);
        System.out.println(c3.contains(32));            // true; the object is present or not;
        System.out.println(c3.contains(34));            // false;
        System.out.println(c1.containsAll(c3));         // true;
        System.out.println(c1.contains(12));            // true;
        c3.remove(31);
        c3.removeAll(c3);
        System.out.println(c3);
        System.out.println(c2);
        c2.retainAll(c1);                               // delete all except c1 object;
        System.out.println(c2);
        System.out.println("=======================");
        Collection c4=new ArrayList();
        c4.add(41);
        c4.add(42);
        c4.add(43);
        System.out.println(c4);
        c4.clear();
        System.out.println(c4);
    }
}
