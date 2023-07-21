// Question:= user input and if the number is less than 500 then it is divisible by 7 or not,
//              otherwise if the number greater thaN 500 THEN IT WILL Divisible by 12 or not.
//Answer:=
import java.util.Scanner;
public class nested_if_elseprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:=");
        int a=sc.nextInt();

        if (a<=500)
        {
            if (a%7==0)
            {
                System.out.println(" A number is divisible by 7");
            }
            else
            {
                System.out.println(" A number is not divisible by 7");
            }
        }
        else
        {
            if (a%12==0)
            {
                System.out.println(" A number is divisible by 12");
            }
            else
            {
                System.out.println(" A number is not divisible by 12");
            }
        }


    }
}
