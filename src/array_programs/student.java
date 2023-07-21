package array_programs;
import java.util.Scanner;
public class student
{
    String name;
    int age;
    int id;
    student()
    {

    }
    student(String name,int age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public void display_data()
    {
        System.out.print("NAme:="+name);
        System.out.print("Age:="+age);
        System.out.print("id:="+id);
        System.out.println("");
    }
    public static void main(String[] args)
    {
        student s[]=new student[5];
        s[0]= new student("Amit",24,590610);
        s[1]= new student("Ashish",69,190610);
        s[2]= new student("jogi",20,590610);
        s[3]= new student("subham",21,390610);
        s[4]= new student("manik",22,790610);

        for (int i=0;i<s.length;i++)
        {
            System.out.println("name:="+s[i].name+", age:="+s[i].age+", id:="+s[i].id);
        }
    }

}

