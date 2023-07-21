package collection;
public class Employ implements Comparable<Employ>
{
	String name;
	int id;
	double salary;
	Employ()
	{
		
	}
	Employ(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String toString()
	{
		return "Name is: "+name+" ID is: "+id+" Salary is: "+salary;
	}

	public int compareTo(Employ e)
	{
		return this.name.compareTo(e.name);
	}

	/*public int compareTo(Employ e)
	{
		return (int)(this.salary-e.salary);
	}*/

	/*public int compareTo(Employ e)
	{
		if(this.salary>e.salary)
		{
			return 1;
		}
		else if(this.salary<e.salary)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/

}












