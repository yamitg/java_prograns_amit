package java_100_comm_list;

import java.util.Scanner;

public class fahrenheit_2_celsius
{
    public static void main(String[] args)
    {


            float temperature;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Fahrenheit: ");
            temperature = sc.nextInt();
            temperature = ((temperature - 32)*5)/9;

            System.out.println("Temperature in Celsius = "+ temperature);


        }

}
