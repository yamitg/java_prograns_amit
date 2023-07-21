public class employee
{
    static String cmp_name="qspider";
            String emp_name;
            int age;
            public static void biometric()
            {
                System.out.println("Employee should give biometeric");
            }
            public void work()
            {
                System.out.println("employee is working");
            }

    public static void main(String[] args)
    {
        System.out.println(cmp_name);
        biometric();
        employee e1=new employee();
        System.out.println(e1.emp_name);
        System.out.println(e1.age);
        e1.work();
    }
}
