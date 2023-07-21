package array_programs;

public class employee_driver
{
    public static void main(String[] args)
    {
        employee e[]=new employee[5];
        e[0]=new employee("amit",236363.09,29_04_2022);
        e[1]=new employee("amit",236363.09,29_04_2022);
        e[2]=new employee("amit",236363.09,29_04_2022);
        e[3]=new employee("amit",236363.09,29_04_2022);
        e[4]=new employee("amit",236363.09,29_04_2022);
        for (int i=0;i<e.length;i++)
        {
            e[i].display_ep_data();
        }
    }
}
