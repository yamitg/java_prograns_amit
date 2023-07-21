package oops_java;
//                              Topic:= encapsulation_oops--02

public class employee_driver_encap
{
    public static void main(String[] args)
    {
        employee_encap e1=new employee_encap();
        e1.setName("Amit Yadav");
        e1.setAge(24);
        e1.setSalary(45000.32);
        System.out.println("Name:= "+e1.getName());
        System.out.println("Age:= "+e1.getAge());
        System.out.println("Salary:= "+e1.getSalary());
    }
}
