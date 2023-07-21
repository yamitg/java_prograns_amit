package java_100_comm_list;

import java.util.Scanner;

public class ch_num_special
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any object:=");
        char ch=sc.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            System.out.println("Enter the object is (Character):="+ch);
        }
        else if (ch>='1' && ch<='9')
        {
            System.out.println("Enter object is an (number):="+ch);
        }
        else
        {
            System.out.println("Enter Object is an (special number):="+ch);
        }
//        System.out.println("Do You Want To Continue(Y/N)");
//        char choice = sc.next().charAt(0);
//        while(choice == 'Y'|| choice == 'y');
//        {
//            System.out.println("choice"+choice);
//        }


    }
}
