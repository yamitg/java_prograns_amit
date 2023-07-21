import java.util.Scanner;

public class Stringpractice
{
    public static void main(String[] args) {

        String name = "Amit kumar";
        Scanner sc= new Scanner(System.in);
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));
        System.out.println(name.replace("kumar","yadav"));

        String myString =" please detect the  double and five space in     the sequence ";
//        myString= myString.indexOf("  ");
//        myString= myString.indexOf("     ");
//        System.out.println(myString);

        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("     "));
        System.out.println(myString.indexOf("        "));    // 7 space , it is not in it then return (-1)


    }



}
