package oops_java;
//                              Topic:= encapsulation_oops--01
public class employee_encap
{

    private String name;
    private int age;
    private double salary;

    public void setName( String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public  double getSalary()
    {
        return salary;
    }



}
