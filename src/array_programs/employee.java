package array_programs;

public class employee
{
//    WAP to create a employee class ,employee may have name ,salalry, joining date and company name. create 5 object of employee and store in single contaoner
//and     also display all the informatation of each object present in array.
//
    String name;

    double salary;
    int joining_date;
    static String company_name="j_spider";

    employee()
    {

    }
    employee(String name,double salary,int joining_date)
    {
        this.name=name;
        this.salary=salary;
        this.joining_date=joining_date;
    }

    public void display_ep_data()
    {
        System.out.print("name:="+name);
        System.out.print("salary:="+salary);
        System.out.print("joining_date:="+joining_date);
        System.out.println("company_name:="+company_name );
    }




}


