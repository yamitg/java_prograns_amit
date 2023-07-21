package array_programs;

//      Sum of al the elements present inside int type elements
//  WAJP sum of even indexes elments of double type of elements

import java.util.Scanner;

//`             Problem :=1
public class even_num_index
{
    public static void main(String[] args)
    {
//          int arr[]={10,276,47,45,29,34,63};
//          for(int i=0;i<arr.length;i++)
//          {
//              System.out.println("Arrays Print:="+arr[i]);
//          }
//

        //`             Problem :=2

//        int arr[]={10,276,47,45,29,34,63};
//          for(int i=0;i<arr.length;i=i+2)
//          {
//
//              System.out.println("Arrays even index elementsPrint:="+arr[i]);
//          }

        //`             Problem :=3

//        int arr[]={10,276,47,45,29,34,63};
//        for(int i=1;i<arr.length;i=i+2)
//        {
//
//            System.out.println("Arrays odd index elements:="+arr[i]);
//        }

//      problem no.:=4

//        int arr[]={10,276,47,45,29,34,63};
//        int sum=0;
//        for (int i=0;i<arr.length;i++)
//        {
//            sum=sum+arr[i];
//        }
//        System.out.println(" Sum of all the elements:= "+sum);

//        problem no.:=5

//        int arr[]={10,276,47,45,29,34,63};
//        int sum=0;
//          for(int i=0;i<arr.length;i=i+2)
//          {
//              sum=sum+arr[i];
////              System.out.println("Arrays even index elementsPrint:="+arr[i]);
//          }
//        System.out.println("Sum of all even elements:="+sum);
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter The Character:=");
//        char c[]=new char[6];
//        for(int i=0;i<c.length;i++)
//        {
//            c[i]=sc.nextLine().charAt(0);
//        }
//        for (int j=0;j<c.length;j++)
//        {
//            System.out.println("Character print:="+c[j]);
//        }

//        System.out.print("Enter The String:=");
//        String str[]=new String[6];
//        for(int i=0;i<str.length;i++)
//        {
//            str[i]=sc.next();
//        }
//        for (int j=0;j<str.length;j++)
//        {
//            System.out.println("Character print:="+str[j]);
//        }
//        System.out.println(str.toString());



        //    WajP to prime all the prime nummber persent in a int type of array, the give array should have length 7.

        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Array elements:= "+arr[i]);
        }
//        5,7,12,3,4,8,9,11
        int sum=0;

        for (int i=0;i<arr.length;i++)
        {
            int count=0;
            for (int j=2;j<=arr[i]/2;j++)
            {
                if (arr[i] % j == 0)
                {
                    count++;
//                    System.out.println("count:=" + count);
                }
            }
            if(count==0)
            {
                System.out.println("nUmber is prime number:= "+arr[i]);
                sum=sum+arr[i];
            }
            else
            {
                System.out.println("Enter number is not prime number"+arr[i]);
            }
        }
        System.out.println("sum:="+sum);
    }


//    WAJP to find out the smallest element in a double type of array.
//    WAJP to find largest element in a int type array.






}
